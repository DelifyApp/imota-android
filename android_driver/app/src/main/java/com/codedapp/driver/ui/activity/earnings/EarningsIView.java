package com.codedapp.driver.ui.activity.earnings;


import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.EarningsList;

public interface EarningsIView extends MvpView {

    void onSuccess(EarningsList earningsLists);

    void onError(Throwable e);
}
