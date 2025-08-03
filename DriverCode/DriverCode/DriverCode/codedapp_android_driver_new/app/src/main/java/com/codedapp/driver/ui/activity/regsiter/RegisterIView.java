package com.codedapp.driver.ui.activity.regsiter;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.SettingsResponse;
import com.codedapp.driver.data.network.model.User;

public interface RegisterIView extends MvpView {

    void onSuccess(User user);

    void onSuccess(Object verifyEmail);

    void onSuccess(SettingsResponse response);

    void onError(Throwable e);

    void onSuccessPhoneNumber(Object object);

    void onVerifyPhoneNumberError(Throwable e);

    void onVerifyEmailError(Throwable e);

}
