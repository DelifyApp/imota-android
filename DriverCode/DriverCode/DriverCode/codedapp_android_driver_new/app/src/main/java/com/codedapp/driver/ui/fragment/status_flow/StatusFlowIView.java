package com.codedapp.driver.ui.fragment.status_flow;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.TimerResponse;

public interface StatusFlowIView extends MvpView {

    void onSuccess(Object object);

    void onWaitingTimeSuccess(TimerResponse object);

    void onError(Throwable e);
}
