package com.codedapp.driver.ui.fragment.dispute;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.DisputeResponse;

import java.util.List;

public interface DisputeIView extends MvpView {

    void onSuccessDispute(List<DisputeResponse> responseList);

    void onSuccess(Object object);

    void onError(Throwable e);
}
