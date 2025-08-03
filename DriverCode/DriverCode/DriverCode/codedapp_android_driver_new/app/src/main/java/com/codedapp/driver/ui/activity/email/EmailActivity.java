package com.codedapp.driver.ui.activity.email;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.codedapp.driver.BuildConfig;
import com.codedapp.driver.R;
import com.codedapp.driver.base.BaseActivity;
import com.codedapp.driver.common.Constants;
import com.codedapp.driver.common.SharedHelper;
import com.codedapp.driver.ui.activity.password.PasswordActivity;
import com.codedapp.driver.ui.activity.regsiter.RegisterActivity;
import com.codedapp.driver.ui.activity.welcome.WelcomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EmailActivity extends BaseActivity implements EmailIView {

    @BindView(R.id.email)
    TextInputEditText email;
    @BindView(R.id.sign_up)
    TextView signUp;
    @BindView(R.id.next)
    FloatingActionButton next;

    EmailIPresenter presenter = new EmailPresenter();

    @Override
    public int getLayoutId() {
        return R.layout.activity_email;
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);
        presenter.attachView(this);

        if (BuildConfig.DEBUG) email.setText("stevejobs@yopmail.com");
    }

    @OnClick({R.id.back, R.id.sign_up, R.id.next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
//                activity().onBackPressed();
                startActivity(new Intent(this, WelcomeActivity.class));
                finish();
                break;
            case R.id.sign_up:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
            case R.id.next:
                performNextClick();
                break;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode== KeyEvent.KEYCODE_BACK)
        {
            Intent intent = new Intent(EmailActivity.this, WelcomeActivity.class);
            startActivity(intent);
            finish();
        }
        return true;
    }

    private void performNextClick() {
        String userEmail = email.getText().toString().trim();
        if (userEmail.isEmpty()) {
            Toast.makeText(this, getString(R.string.invalid_email), Toast.LENGTH_SHORT).show();
            email.requestFocus();
            return;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(userEmail).matches()) {
            Toast.makeText(this, getString(R.string.valid_email), Toast.LENGTH_SHORT).show();
            email.requestFocus();
            return;
        }
        Intent i = new Intent(this, PasswordActivity.class);
        i.putExtra(Constants.SharedPref.EMAIL, email.getText().toString());
        SharedHelper.putKey(this, Constants.SharedPref.TXT_EMAIL, email.getText().toString());
        startActivity(i);
    }
}
