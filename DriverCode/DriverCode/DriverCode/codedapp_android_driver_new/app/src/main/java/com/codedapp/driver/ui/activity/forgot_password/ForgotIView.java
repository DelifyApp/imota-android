package com.codedapp.driver.ui.activity.forgot_password;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.ForgotResponse;

public interface ForgotIView extends MvpView {

    void onSuccess(ForgotResponse forgotResponse);
    void onError(Throwable e);
}
