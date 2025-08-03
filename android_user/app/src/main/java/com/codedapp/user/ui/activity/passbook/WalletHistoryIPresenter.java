package com.codedapp.user.ui.activity.passbook;

import com.codedapp.user.base.MvpPresenter;

public interface WalletHistoryIPresenter<V extends WalletHistoryIView> extends MvpPresenter<V> {
    void wallet();
}
