package com.codedapp.driver.ui.fragment.past;


import com.codedapp.driver.base.MvpPresenter;

public interface PastTripIPresenter<V extends PastTripIView> extends MvpPresenter<V> {

    void getHistory();

}
