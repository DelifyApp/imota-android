package com.codedapp.driver.ui.activity.wallet;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.WalletMoneyAddedResponse;
import com.codedapp.driver.data.network.model.WalletResponse;

public interface WalletIView extends MvpView {

    void onSuccess(WalletResponse response);

    void onSuccess(WalletMoneyAddedResponse response);

    void onError(Throwable e);
}
