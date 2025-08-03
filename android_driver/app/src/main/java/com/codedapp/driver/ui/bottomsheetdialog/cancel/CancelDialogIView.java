package com.codedapp.driver.ui.bottomsheetdialog.cancel;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.CancelResponse;

import java.util.List;

public interface CancelDialogIView extends MvpView {

    void onSuccessCancel(Object object);
    void onError(Throwable e);
    void onSuccess(List<CancelResponse> response);
    void onReasonError(Throwable e);
}
