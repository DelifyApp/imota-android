package com.codedapp.driver.ui.fragment.upcoming;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.HistoryList;

import java.util.List;

public interface UpcomingTripIView extends MvpView {

    void onSuccess(List<HistoryList> historyList);
    void onError(Throwable e);
}
