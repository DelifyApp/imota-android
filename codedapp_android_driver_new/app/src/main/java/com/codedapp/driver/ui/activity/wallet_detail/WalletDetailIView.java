package com.codedapp.driver.ui.activity.wallet_detail;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.Transaction;

import java.util.ArrayList;

public interface WalletDetailIView extends MvpView {
    void setAdapter(ArrayList<Transaction> myList);
}
