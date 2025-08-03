package com.codedapp.driver.ui.activity.instant_ride;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.EstimateFare;
import com.codedapp.driver.data.network.model.TripResponse;

public interface InstantRideIView extends MvpView {

    void onSuccess(EstimateFare estimateFare);

    void onSuccess(TripResponse response);

    void onError(Throwable e);

}
