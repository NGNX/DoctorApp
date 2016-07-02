package com.projects.android.chaditya.doctorapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.projects.android.chaditya.doctorapp.constants.DoctorAppPreferences;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

public class LoginActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener, View.OnClickListener{

    private GoogleApiClient mGoogleApiClient;
    private SignInButton mGoogleSignInButton;
    private LoginButton mFacebookSignInButton;
    private final int REQUEST_CODE_FOR_GOOGLE_SIGN_IN = 1;
    private final String LOG_TAG = LoginActivity.class.getSimpleName();
    CallbackManager mCallbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mGoogleSignInButton = (SignInButton) findViewById(R.id.google_sign_in_button);
        mFacebookSignInButton = (LoginButton) findViewById(R.id.facebook_sign_in_button);
        registerWithGoogleServices();
        mCallbackManager = CallbackManager.Factory.create();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGoogleSignInButton.setOnClickListener(this);
        mFacebookSignInButton.setReadPermissions(Arrays.asList("email","public_profile"));
        mFacebookSignInButton.registerCallback(mCallbackManager, new MyFacebookCallback());
    }

    @Override
    protected void onPause() {
        super.onPause();
        mGoogleSignInButton.setOnClickListener(null);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQUEST_CODE_FOR_GOOGLE_SIGN_IN :
                GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
                handleGoogleSignInResult(result);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.google_sign_in_button:
                googleSignIn();
                break;
        }
    }

    private void registerWithGoogleServices() {

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .requestProfile()
                .requestId()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this /* FragmentActivity */, this /* OnConnectionFailedListener */)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Toast.makeText(getApplicationContext(),"Sorry, there was an error signing in with google",Toast.LENGTH_LONG).show();
    }

    private void googleSignIn() {
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        startActivityForResult(signInIntent, REQUEST_CODE_FOR_GOOGLE_SIGN_IN);
    }

    private void handleGoogleSignInResult(GoogleSignInResult result) {
        Log.d(LOG_TAG, "handleSignInResult:" + result.isSuccess());
        if (result.isSuccess()) {
            // Signed in successfully, show authenticated UI.
            GoogleSignInAccount acct = result.getSignInAccount();

            if(acct != null) {
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putBoolean(DoctorAppPreferences.IS_LOGGED_IN,true);
                editor.putBoolean(DoctorAppPreferences.LOGGED_IN_VIA_GOOGLE,true);
                String displayName = acct.getDisplayName() == null ? "Some User" : acct.getDisplayName();
                editor.putString(DoctorAppPreferences.USER_NAME,displayName);
                editor.putString(DoctorAppPreferences.EMAIL_ID,acct.getEmail());
                String imageUriAsString = acct.getPhotoUrl() == null ? "" : acct.getPhotoUrl().toString();
                editor.putString(DoctorAppPreferences.PROFILE_PHOTO,imageUriAsString);
                editor.apply();

                Intent intent;
                if(sharedPreferences.getBoolean(DoctorAppPreferences.IS_LOCATION_PRESENT,false)){
                    intent = new Intent(LoginActivity.this,MainActivity.class);
                }else{
                    intent = new Intent(LoginActivity.this,LocationActivity.class);
                }
                startActivity(intent);
                finish();
            }else{
                Log.d(LOG_TAG,"Sorry, there was an error signing in with google");
            }
        } else {
            Toast.makeText(getApplicationContext(),"Sorry, there was an error signing in with google",Toast.LENGTH_LONG).show();
        }
    }

    private class MyFacebookCallback implements FacebookCallback<LoginResult> {
        @Override
        public void onSuccess(LoginResult loginResult) {
            GraphRequest request = GraphRequest.newMeRequest(
                    loginResult.getAccessToken(),
                    new GraphRequest.GraphJSONObjectCallback() {
                        @Override
                        public void onCompleted(JSONObject object, GraphResponse response) {
                            Log.v("LoginActivity", response.toString());
                            Log.d(LOG_TAG,"JSON RESPONSE" + object);
                            // Application code
                            try {
                                String email = object.getString("email");
                                String name = object.getString("name");
                                String image = object.getJSONObject("picture").getJSONObject("data").getString("url");
                                SharedPreferences sharedPreferences = PreferenceManager.
                                        getDefaultSharedPreferences(getApplicationContext());
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putBoolean(DoctorAppPreferences.IS_LOGGED_IN,true);
                                editor.putBoolean(DoctorAppPreferences.LOGGED_IN_VIA_FACEBOOK,true);
                                editor.putString(DoctorAppPreferences.USER_NAME,name);
                                editor.putString(DoctorAppPreferences.EMAIL_ID,email);
                                editor.putString(DoctorAppPreferences.PROFILE_PHOTO,image);
                                editor.apply();
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    });
            Bundle parameters = new Bundle();
            parameters.putString("fields", "name,email,picture");
            request.setParameters(parameters);
            request.executeAsync();
        }

        @Override
        public void onCancel() {
            Log.d(LOG_TAG,"onCancel method called in MyFacebookCallback!");
        }

        @Override
        public void onError(FacebookException exception) {
            Toast.makeText(getApplicationContext(),"Sorry, there was an error signing in with facebook",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed() {
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
    }
}
