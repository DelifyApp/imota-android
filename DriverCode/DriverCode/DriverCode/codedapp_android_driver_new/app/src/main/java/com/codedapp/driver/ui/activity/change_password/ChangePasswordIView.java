package com.codedapp.driver.ui.activity.change_password;

import com.codedapp.driver.base.MvpView;

public interface ChangePasswordIView extends MvpView {


    void onSuccess(Object object);
    void onError(Throwable e);
}
