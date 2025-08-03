package com.codedapp.driver.ui.activity.document;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.DriverDocumentResponse;

public interface DocumentIView extends MvpView {

    void onSuccess(DriverDocumentResponse response);

    void onDocumentSuccess(DriverDocumentResponse response);

    void onError(Throwable e);

    void onSuccessLogout(Object object);

}
