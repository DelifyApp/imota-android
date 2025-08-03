package com.codedapp.driver.ui.activity.setting;

import com.codedapp.driver.base.MvpPresenter;

public interface SettingsIPresenter<V extends SettingsIView> extends MvpPresenter<V> {
    void changeLanguage(String languageID);
}
