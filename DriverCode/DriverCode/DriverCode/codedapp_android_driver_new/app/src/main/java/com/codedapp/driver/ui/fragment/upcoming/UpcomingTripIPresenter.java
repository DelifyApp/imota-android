package com.codedapp.driver.ui.fragment.upcoming;


import com.codedapp.driver.base.MvpPresenter;

public interface UpcomingTripIPresenter<V extends UpcomingTripIView> extends MvpPresenter<V> {

    void getUpcoming();

}
