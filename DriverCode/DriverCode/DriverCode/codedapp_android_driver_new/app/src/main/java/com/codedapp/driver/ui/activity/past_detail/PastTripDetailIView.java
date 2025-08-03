package com.codedapp.driver.ui.activity.past_detail;


import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.HistoryDetail;

public interface PastTripDetailIView extends MvpView {

    void onSuccess(HistoryDetail historyDetail);
    void onError(Throwable e);
}
