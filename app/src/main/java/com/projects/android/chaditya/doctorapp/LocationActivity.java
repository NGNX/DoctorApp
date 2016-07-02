package com.projects.android.chaditya.doctorapp;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.ui.PlaceAutocomplete;
import com.google.android.gms.maps.model.LatLng;
import com.projects.android.chaditya.doctorapp.constants.DoctorAppPreferences;
import com.projects.android.chaditya.doctorapp.locationutils.GPSTracker;

public class LocationActivity extends AppCompatActivity implements View.OnClickListener, GoogleApiClient.OnConnectionFailedListener {

    private LinearLayout mEnableGpsButton;
    private LinearLayout mPickLocationButton;
    private double mLatitude, mLongitude;
    private final int PLACE_AUTOCOMPLETE_REQUEST_CODE = 1;
    private final int REQUEST_CODE_ASK_PERMISSIONS = 2;
    GoogleApiClient mGoogleApiClient;
    private final static String LOG_TAG = LocationActivity.class.getSimpleName();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        mEnableGpsButton = (LinearLayout) findViewById(R.id.enable_gps_id);
        mPickLocationButton = (LinearLayout) findViewById(R.id.pick_location_id);

        mGoogleApiClient = new GoogleApiClient
                .Builder(this)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .enableAutoManage(this, this)
                .build();

        mContext = getApplicationContext();
        checkLocationPermission();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mEnableGpsButton.setOnClickListener(this);
        mPickLocationButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.enable_gps_id : {
                GPSTracker gpsTracker = new GPSTracker();
                mLatitude = gpsTracker.getLatitude();
                mLongitude = gpsTracker.getLongitude();
                startMainActivity();
                gpsTracker.stopUsingGPS();
                break;
            }
            case R.id.pick_location_id : {
                findPlace();
                break;
            }
        }
    }

    private void checkLocationPermission(){
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            int hasFineLocationPermission = checkSelfPermission(android.Manifest.permission.ACCESS_FINE_LOCATION);
            if (hasFineLocationPermission != PackageManager.PERMISSION_GRANTED) {
                if (!shouldShowRequestPermissionRationale(android.Manifest.permission.ACCESS_FINE_LOCATION)) {
                    showMessageOKCancel("You need to allow access to your Location",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                        requestPermissions(new String[] {Manifest.permission.ACCESS_FINE_LOCATION},
                                                REQUEST_CODE_ASK_PERMISSIONS);
                                    }
                                }
                            },
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    finish();
                                }
                            });
                    return;
                }
                requestPermissions(new String[] {android.Manifest.permission.ACCESS_FINE_LOCATION},
                        REQUEST_CODE_ASK_PERMISSIONS);
            }
        }
    }

    private void showMessageOKCancel(String message, DialogInterface.OnClickListener okListener, DialogInterface.OnClickListener cancelListener) {
        new AlertDialog.Builder(LocationActivity.this)
                .setMessage(message)
                .setPositiveButton("OK", okListener)
                .setNegativeButton("Cancel", cancelListener)
                .create()
                .show();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CODE_ASK_PERMISSIONS:
                if (grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(LocationActivity.this, "Please provide access to your location", Toast.LENGTH_SHORT)
                            .show();
                    finish();
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override
    public void onBackPressed() {
        if(!getIntent().hasExtra(MainActivity.class.getSimpleName())){
            new AlertDialog.Builder(this)
                    .setMessage("Are you sure you want to exit DoctorApp?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface arg0, int arg1) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface arg0, int arg1) {}
                    })
                    .show();
        }else{
            Intent intent = new Intent(LocationActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Toast.makeText(getApplicationContext(),"Sorry, there was an error detecting your location. Try again later",Toast.LENGTH_LONG).show();
    }

    private void findPlace() {
        try {
            Intent intent =
                    new PlaceAutocomplete.IntentBuilder(PlaceAutocomplete.MODE_FULLSCREEN)
                            .build(this);
            startActivityForResult(intent, PLACE_AUTOCOMPLETE_REQUEST_CODE);
        } catch (GooglePlayServicesRepairableException | GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PLACE_AUTOCOMPLETE_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Place place = PlaceAutocomplete.getPlace(this, data);
                Log.i(LOG_TAG, "Place: " + place.getName());
                LatLng latLng = place.getLatLng();
                mLatitude = latLng.latitude;
                mLongitude = latLng.longitude;
                startMainActivity();
            } else if (resultCode == PlaceAutocomplete.RESULT_ERROR) {
                Status status = PlaceAutocomplete.getStatus(this, data);
                // TODO: Handle the error.
                Log.i(LOG_TAG, status.getStatusMessage());
                Toast.makeText(getApplicationContext(),"Sorry, there was error finding your place. Try again later",Toast.LENGTH_LONG).show();
            } else if (resultCode == RESULT_CANCELED) {
                // The user canceled the operation.
                Toast.makeText(getApplicationContext(),"Did not choose any location",Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void startMainActivity() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(DoctorAppPreferences.IS_LOCATION_PRESENT,true);
        editor.putFloat(DoctorAppPreferences.LATITUDE,(float) mLatitude);
        editor.putFloat(DoctorAppPreferences.LONGITUDE, (float) mLongitude);
        editor.apply();
        Intent intent = new Intent(LocationActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
