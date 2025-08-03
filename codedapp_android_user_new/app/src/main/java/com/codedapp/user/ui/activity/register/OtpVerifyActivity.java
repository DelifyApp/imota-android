package com.codedapp.user.ui.activity.register;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.codedapp.user.BuildConfig;
import com.codedapp.user.R;
import com.codedapp.user.data.SharedHelper;
import com.codedapp.user.data.network.model.RegisterResponse;
import com.codedapp.user.data.network.model.SettingsResponse;
import com.codedapp.user.ui.activity.main.MainActivity;

import java.util.HashMap;

import es.dmoral.toasty.Toasty;

public class OtpVerifyActivity extends AppCompatActivity implements RegisterIView {
    Toolbar mToolbar;
    EditText email;
    FloatingActionButton next;
    private RegisterPresenter<OtpVerifyActivity> registerPresenter = new RegisterPresenter();
    String mobile, first_name, last_name, emails, password_confirmation, device_token, device_id, device_type, country_code, login_by, referral_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verify);
        Intent intent = getIntent();
        first_name = intent.getStringExtra("first_name");
        last_name = intent.getStringExtra("last_name");
        emails = intent.getStringExtra("email");
        password_confirmation = intent.getStringExtra("password_confirmation");
        device_token = intent.getStringExtra("device_token");
        device_id = intent.getStringExtra("device_id");
        mobile = intent.getStringExtra("mobile");
        country_code = intent.getStringExtra("country_code");
        device_type = intent.getStringExtra("device_type");
        login_by = intent.getStringExtra("login_by");
        referral_code = intent.getStringExtra("referral_code");
        registerPresenter.attachView(this);
        email = findViewById(R.id.email);
        mToolbar = findViewById(R.id.toolbar);
       /* setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        mToolbar.setTitle(getString(R.string.otps));
        mToolbar.setTitleTextColor(getResources().getColor(R.color.white));
        mToolbar.setNavigationOnClickListener(v -> {

            finish();
        });*/
        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().trim().isEmpty()) {
                    Toast.makeText(OtpVerifyActivity.this, "Please enter otp", Toast.LENGTH_SHORT).show();
                } else {
                    registerPresenter.verifyotp(mobile, email.getText().toString().trim());
                }
            }
        });
    }

    @Override
    public void onSuccess(SettingsResponse response) {

    }

    @Override
    public void onSuccess(RegisterResponse object) {
        try {
            hideLoading();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        Toast.makeText(this, getString(R.string.you_have_been_successfully_registered),
                Toast.LENGTH_SHORT).show();
        SharedHelper.putKey(this, "access_token", "Bearer " + object.getAccessToken());
        SharedHelper.putKey(this, "logged_in", true);
        finishAffinity();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void onSuccess(Object object) {

    }

    @Override
    public void onSuccessPhoneNumber(OtpREsponse object) {
        if (object.status.equals("pending")) {
            showErrorMessage(email, "Invalid OTP");
        } else {
            HashMap<String, Object> map = new HashMap<>();
            map.put("first_name", first_name);
            map.put("last_name", last_name);
            map.put("email", emails);
            map.put("password", password_confirmation);
            map.put("password_confirmation", password_confirmation);
            map.put("device_token", device_token);
            map.put("device_id", device_id);
            map.put("mobile", mobile);
            map.put("country_code", country_code);
            map.put("device_type", BuildConfig.DEVICE_TYPE);
            map.put("login_by", "manual");
            if (referral_code == null) {

            } else {
                map.put("referral_code", referral_code);
            }
            showLoading();
            registerPresenter.register(map);
        }
    }

    @Override
    public void onVerifyPhoneNumberError(Throwable e) {

    }

    @Override
    public Activity baseActivity() {
        return null;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() throws Exception {

    }

    @Override
    public void onSuccessLogout(Object object) {

    }

    @Override
    public void onError(Throwable e) {
        showErrorMessage(email, e.toString());
    }

    private void showErrorMessage(EditText view, String message) {
        Toasty.error(this, message, Toast.LENGTH_SHORT).show();
        view.requestFocus();
        view.setText(null);
    }

    @Override
    public void onVerifyEmailError(Throwable e) {

    }
}