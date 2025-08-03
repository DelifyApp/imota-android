package com.codedapp.driver.ui.activity.reset_password;

import com.codedapp.driver.base.MvpView;

public interface ResetIView extends MvpView{

    void onSuccess(Object object);
    void onError(Throwable e);
}
