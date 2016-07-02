package com.projects.android.chaditya.doctorapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.projects.android.chaditya.doctorapp.adapter.CustomHospitalListViewAdapter;
import com.projects.android.chaditya.doctorapp.beans.HospitalItem;
import com.projects.android.chaditya.doctorapp.constants.DoctorAppConstants;
import com.projects.android.chaditya.doctorapp.constants.DoctorAppPreferences;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private ListView mHospitalItemListView;
    private ArrayList<HospitalItem> mHospitalItems = new ArrayList<>();
    private CustomHospitalListViewAdapter mAdapter;
    Map<String,String> mQueryParams = new HashMap<>();
    private final static String LOG_TAG = MainActivity.class.getSimpleName();
    private android.support.v7.widget.ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        mHospitalItemListView = (ListView) findViewById(R.id.hospitalListView);
        mAdapter = new CustomHospitalListViewAdapter(this,mHospitalItems);
        mHospitalItemListView.setAdapter(mAdapter);
        obtainDistrictFromLatLng();
        putLogTagForLocaitonInfo();
        String district = PreferenceManager.getDefaultSharedPreferences(mContext)
                .getString(DoctorAppPreferences.DISTRICT,DoctorAppPreferences.DEFAULT_TEXT_WHEN_NO_DISTRICT_IS_AVAILABLE);
        if(!district.equals(DoctorAppPreferences.DEFAULT_TEXT_WHEN_NO_DISTRICT_IS_AVAILABLE))
            new FetchHospitals().execute(district);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.location_picker:
                Intent intent = new Intent(MainActivity.this,LocationActivity.class);
                intent.putExtra(MainActivity.class.getSimpleName(),true);
                startActivity(intent);
                finish();
                return true;
            case R.id.share_button_option:
                mShareActionProvider = (android.support.v7.widget.ShareActionProvider) MenuItemCompat.getActionProvider(item);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void setShareIntent(Intent shareIntent) {
        if (mShareActionProvider != null) {
            mShareActionProvider.setShareIntent(shareIntent);
        }
    }

    private void obtainDistrictFromLatLng() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        float latitude = sharedPreferences.getFloat(DoctorAppPreferences.LATITUDE,0.0F);
        float longitude = sharedPreferences.getFloat(DoctorAppPreferences.LONGITUDE,0.0F);
        Address address;
        String district = null;
        try {
            List<Address> addressList = new Geocoder(getApplicationContext()).getFromLocation(latitude,longitude,1);
            if(addressList.size() > 0){
                address = addressList.get(0);
                district = address.getLocality();
            }else{
                district = DoctorAppPreferences.DEFAULT_TEXT_WHEN_NO_DISTRICT_IS_AVAILABLE;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(DoctorAppPreferences.DISTRICT,district);
        editor.apply();
    }

    public class FetchHospitals extends AsyncTask<String, Void, ArrayList<HospitalItem> > {
        private final String LOG_TAG = FetchHospitals.class.getSimpleName();

        private ArrayList<HospitalItem>  getHospitalDataFromJson(String jsonStr)
                throws JSONException {
            ArrayList<HospitalItem> resultHosps = new ArrayList<>();
            JSONObject obs = new JSONObject(jsonStr);
            JSONArray arr = obs.getJSONArray("records");
            for(int i = 0; i < arr.length(); i++)
            {
                JSONObject ob = arr.getJSONObject(i);
                HospitalItem hosp = new HospitalItem();
                hosp.setHospitalName(ob.getString("Hospitalname"));
                hosp.setHospitalAddress(ob.get("AddressFirstLine").toString() + ", " + ob.get("District").toString());
                hosp.setHospitalEmail(ob.get("Hospitalprimaryemailid").toString());
                hosp.setHospitalCategory(ob.getString("HospitalCategory"));
                hosp.setHospitalWebsite(ob.getString("Website"));

                String tel = ob.getString("Telephone");
                String telephone = "";
                for(int j = 0;j < tel.length();j++){
                    if(tel.charAt(j) == ',')
                        break;
                    telephone += tel.charAt(j);
                }
                hosp.setHospitalTelephone(telephone);
                hosp.setPincode(ob.getString("Pincode"));
                hosp.setSystemsOfMedicine(ob.getString("SystemsOfMedicine"));
                hosp.setLatitude(ob.getString("Googlemapcorridinatelati"));
                hosp.setLongitude(ob.getString("Googlemapcorridinatelongi"));
                resultHosps.add(hosp);
            }
            return resultHosps;
        }

        @Override
        protected ArrayList<HospitalItem> doInBackground(String... params) {
            if (params.length == 0) {
                return null;
            }
            HttpURLConnection urlConnection = null;
            BufferedReader reader = null;
            String jsonStr = null;
            try {
                final String FIELD_FILTERS = "filters[District]";
                String district = params[0];
                Uri builtUri = Uri.parse(DoctorAppConstants.BASE_URL).buildUpon()
                        .appendQueryParameter(DoctorAppConstants.RESOURCE_ID_PARAM, DoctorAppConstants.resourceId)
                        .appendQueryParameter(DoctorAppConstants.API_KEY_PARAM, DoctorAppConstants.API_KEY)
                        .appendQueryParameter(FIELD_FILTERS, district)
                        .build();
                URL url = new URL(builtUri.toString());
                Log.v(LOG_TAG, "Built URI " + builtUri.toString());
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();
                InputStream inputStream = urlConnection.getInputStream();
                StringBuffer buffer = new StringBuffer();
                if (inputStream == null) {
                    return null;
                }
                reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {
                    buffer.append(line + "\n");
                }
                if (buffer.length() == 0) {
                    return null;
                }
                jsonStr = buffer.toString();
                Log.v(LOG_TAG, "Json string: " + jsonStr);
            } catch (IOException e) {
                Log.e(LOG_TAG, "Error ", e);
                return null;
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (final IOException e) {
                        Log.e(LOG_TAG, "Error closing stream", e);
                    }
                }
            }
            try {
                return getHospitalDataFromJson(jsonStr);
            } catch (JSONException e) {
                Log.e(LOG_TAG, e.getMessage(), e);
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(ArrayList<HospitalItem> result) {
            mAdapter.clear();
            mAdapter.addAll(result);
        }
    }

    private void putLogTagForLocaitonInfo(){
        Log.v(LOG_TAG,"TestToast: " + PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext())
                .getFloat(DoctorAppPreferences.LATITUDE,0.0F) + "," + PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext())
                .getFloat(DoctorAppPreferences.LONGITUDE,0.0F) + " " + PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext())
                .getString(DoctorAppPreferences.DISTRICT,DoctorAppPreferences.DEFAULT_TEXT_WHEN_NO_DISTRICT_IS_AVAILABLE));
    }

}
