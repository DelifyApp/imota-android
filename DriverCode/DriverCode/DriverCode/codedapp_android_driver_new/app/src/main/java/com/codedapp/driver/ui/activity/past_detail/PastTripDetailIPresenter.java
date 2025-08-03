package com.codedapp.driver.ui.activity.past_detail;


import com.codedapp.driver.base.MvpPresenter;

public interface PastTripDetailIPresenter<V extends PastTripDetailIView> extends MvpPresenter<V> {

    void getPastTripDetail(String request_id);
}
