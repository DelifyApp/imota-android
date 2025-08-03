package com.codedapp.driver.ui.activity.earnings;


import com.codedapp.driver.base.MvpPresenter;

public interface EarningsIPresenter<V extends EarningsIView> extends MvpPresenter<V> {

    void getEarnings();
}
