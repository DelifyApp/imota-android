package com.codedapp.driver.ui.activity.password;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.ForgotResponse;
import com.codedapp.driver.data.network.model.User;

public interface PasswordIView extends MvpView {

    void onSuccess(ForgotResponse forgotResponse);

    void onSuccess(User object);

    void onError(Throwable e);
}
