package com.codedapp.driver.ui.fragment.offline;

import com.codedapp.driver.base.MvpView;

public interface OfflineIView extends MvpView {

    void onSuccess(Object object);
    void onError(Throwable e);
}
