package com.codedapp.driver.ui.activity.setting;

import com.codedapp.driver.base.MvpView;

public interface SettingsIView extends MvpView {

    void onSuccess(Object o);

    void onError(Throwable e);

}
