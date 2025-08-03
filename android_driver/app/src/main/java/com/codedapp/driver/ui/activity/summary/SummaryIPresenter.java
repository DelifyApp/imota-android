package com.codedapp.driver.ui.activity.summary;


import com.codedapp.driver.base.MvpPresenter;

public interface SummaryIPresenter<V extends SummaryIView> extends MvpPresenter<V> {

    void getSummary();
}
