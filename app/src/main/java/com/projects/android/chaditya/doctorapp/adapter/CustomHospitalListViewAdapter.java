package com.projects.android.chaditya.doctorapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.projects.android.chaditya.doctorapp.MainActivity;
import com.projects.android.chaditya.doctorapp.R;
import com.projects.android.chaditya.doctorapp.beans.HospitalItem;
import com.projects.android.chaditya.doctorapp.constants.DoctorAppPreferences;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by ch.aditya on 01-07-2016.
 */
public class CustomHospitalListViewAdapter extends ArrayAdapter<HospitalItem>{

    private Context mContext;
    private ArrayList<HospitalItem> mHospitalItems;

    public CustomHospitalListViewAdapter(MainActivity mainActivity, ArrayList<HospitalItem> hospitalItems) {
        super(mainActivity, 0, hospitalItems);
        mContext = mainActivity;
        mHospitalItems = hospitalItems;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder mViewHolder;
        if(view == null){
            LayoutInflater inflater = ( LayoutInflater )mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.hospital_list_item,null);
            mViewHolder = new ViewHolder(view);
            view.setTag(mViewHolder);
        }else{
            mViewHolder = (ViewHolder) view.getTag();
        }
        final HospitalItem hospitalItem = getItem(position);
        if(hospitalItem != null) {
            mViewHolder.hospitalNameTextView.setText(hospitalItem.getHospitalName());
            mViewHolder.hospitalCategoryTextView.setText(hospitalItem.getHospitalCategory());
            mViewHolder.hospitalAddressTextView.setText(hospitalItem.getHospitalAddress());
            if(hospitalItem.getHospitalTelephone() == null || hospitalItem.getHospitalTelephone().equals("NA")){
                mViewHolder.hospitalEmailImageView.setVisibility(View.GONE);
            }
            if(hospitalItem.getHospitalEmail() == null || hospitalItem.getHospitalEmail().equals("NA")){
                mViewHolder.hospitalEmailImageView.setVisibility(View.GONE);
            }
            if(hospitalItem.getHospitalWebsite() == null || hospitalItem.getHospitalWebsite().equals("NA")){
                mViewHolder.hospitalWebsiteImageView.setVisibility(View.GONE);
            }
            setListeners(mViewHolder,hospitalItem);
        }
        return view;
    }

    private void setListeners(ViewHolder viewHolder, final HospitalItem hospitalItem) {
        viewHolder.hospitalDirectionsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=" + hospitalItem.getLatitude() + "," + hospitalItem.getLongitude());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(mContext.getPackageManager()) != null) {
                    mContext.startActivity(mapIntent);
                }
            }
        });
        viewHolder.hospitalContactImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String uri = "tel:" + hospitalItem.getHospitalTelephone();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(uri));
                mContext.startActivity(intent);
            }
        });
        viewHolder.hospitalEmailImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{hospitalItem.getHospitalEmail()});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Emergency");

                String message = "Help";
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
                float latitude = sharedPreferences.getFloat(DoctorAppPreferences.LATITUDE,0.0F);
                float longitude = sharedPreferences.getFloat(DoctorAppPreferences.LONGITUDE,0.0F);
                Address address = null;
                try {
                    address = new Geocoder(getContext()).getFromLocation(latitude,longitude,1).get(0);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(address != null)
                    message += " " + address.getAddressLine(0);
                intent.putExtra(Intent.EXTRA_TEXT, message);

                mContext.startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });
        viewHolder.hospitalWebsiteImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://" + hospitalItem.getHospitalWebsite());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                mContext.startActivity(intent);
            }
        });
    }

    private class ViewHolder {
        TextView hospitalNameTextView;
        TextView hospitalCategoryTextView;
        TextView hospitalAddressTextView;

        ImageView hospitalContactImageView;
        ImageView hospitalEmailImageView;
        ImageView hospitalWebsiteImageView;
        ImageView hospitalDirectionsImageView;

        public ViewHolder(View view) {
            hospitalNameTextView = (TextView) view.findViewById(R.id.hospital_name);
            hospitalCategoryTextView = (TextView) view.findViewById(R.id.hospital_category);
            hospitalAddressTextView = (TextView) view.findViewById(R.id.hospital_address);

            hospitalContactImageView = (ImageView) view.findViewById(R.id.hospital_contact);
            hospitalEmailImageView = (ImageView) view.findViewById(R.id.hospital_email);
            hospitalWebsiteImageView = (ImageView) view.findViewById(R.id.hospital_website);
            hospitalDirectionsImageView = (ImageView) view.findViewById(R.id.hospital_directions);
        }
    }

}
