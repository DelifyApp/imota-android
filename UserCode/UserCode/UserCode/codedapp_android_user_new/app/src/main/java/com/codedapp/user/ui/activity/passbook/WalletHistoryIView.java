package com.codedapp.user.ui.activity.passbook;

import com.codedapp.user.base.MvpView;
import com.codedapp.user.data.network.model.WalletResponse;

public interface WalletHistoryIView extends MvpView {
    void onSuccess(WalletResponse response);

    void onError(Throwable e);
}
