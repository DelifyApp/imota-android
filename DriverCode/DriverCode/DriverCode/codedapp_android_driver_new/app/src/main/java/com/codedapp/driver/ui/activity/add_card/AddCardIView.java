package com.codedapp.driver.ui.activity.add_card;

import com.codedapp.driver.base.MvpView;

public interface AddCardIView extends MvpView {

    void onSuccess(Object card);

    void onError(Throwable e);
}
