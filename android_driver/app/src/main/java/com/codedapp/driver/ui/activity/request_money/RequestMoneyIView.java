package com.codedapp.driver.ui.activity.request_money;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.RequestDataResponse;

public interface RequestMoneyIView extends MvpView {

    void onSuccess(RequestDataResponse response);
    void onSuccess(Object response);
    void onError(Throwable e);

}
