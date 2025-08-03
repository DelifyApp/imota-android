package com.codedapp.user.ui.activity.register;

import com.codedapp.user.base.MvpView;
import com.codedapp.user.data.network.model.RegisterResponse;
import com.codedapp.user.data.network.model.SettingsResponse;

public interface RegisterIView extends MvpView {

    void onSuccess(SettingsResponse response);

    void onSuccess(RegisterResponse object);

    void onSuccess(Object object);

    void onSuccessPhoneNumber(OtpREsponse object);

    void onVerifyPhoneNumberError(Throwable e);

    void onError(Throwable e);

    void onVerifyEmailError(Throwable e);
}
