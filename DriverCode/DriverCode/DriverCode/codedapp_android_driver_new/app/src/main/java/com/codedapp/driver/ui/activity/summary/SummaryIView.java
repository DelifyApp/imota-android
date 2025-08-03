package com.codedapp.driver.ui.activity.summary;


import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.Summary;

public interface SummaryIView extends MvpView {

    void onSuccess(Summary object);

    void onError(Throwable e);
}
