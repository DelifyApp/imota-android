package com.codedapp.driver.ui.activity.wallet_detail;

import com.codedapp.driver.base.MvpPresenter;
import com.codedapp.driver.data.network.model.Transaction;

import java.util.ArrayList;

public interface WalletDetailIPresenter<V extends WalletDetailIView> extends MvpPresenter<V> {
    void setAdapter(ArrayList<Transaction> myList);
}
