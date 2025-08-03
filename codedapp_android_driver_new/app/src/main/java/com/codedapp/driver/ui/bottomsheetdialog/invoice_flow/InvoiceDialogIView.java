package com.codedapp.driver.ui.bottomsheetdialog.invoice_flow;

import com.codedapp.driver.base.MvpView;

public interface InvoiceDialogIView extends MvpView {

    void onSuccess(Object object);
    void onError(Throwable e);
}
