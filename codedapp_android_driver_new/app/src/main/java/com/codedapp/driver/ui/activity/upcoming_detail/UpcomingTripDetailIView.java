package com.codedapp.driver.ui.activity.upcoming_detail;


import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.HistoryDetail;

public interface UpcomingTripDetailIView extends MvpView {

    void onSuccess(HistoryDetail historyDetail);
    void onError(Throwable e);
}
