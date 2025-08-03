package com.codedapp.user.ui.activity.past_trip_detail;

import com.codedapp.user.base.MvpView;
import com.codedapp.user.data.network.model.Datum;

import java.util.List;

public interface PastTripDetailsIView extends MvpView {

    void onSuccess(List<Datum> pastTripDetails);

    void onError(Throwable e);
}
