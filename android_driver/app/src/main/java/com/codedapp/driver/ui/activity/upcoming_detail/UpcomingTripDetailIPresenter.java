package com.codedapp.driver.ui.activity.upcoming_detail;


import com.codedapp.driver.base.MvpPresenter;

public interface UpcomingTripDetailIPresenter<V extends UpcomingTripDetailIView> extends MvpPresenter<V> {

    void getUpcomingDetail(String request_id);

}
