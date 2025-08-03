package com.codedapp.driver.ui.activity.reset_password;

import com.codedapp.driver.base.MvpPresenter;

import java.util.HashMap;

public interface ResetIPresenter<V extends ResetIView> extends MvpPresenter<V> {

    void reset(HashMap<String, Object> obj);

}
