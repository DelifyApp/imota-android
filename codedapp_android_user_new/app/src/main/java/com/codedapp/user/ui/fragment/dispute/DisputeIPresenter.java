package com.codedapp.user.ui.fragment.dispute;

import com.codedapp.user.base.MvpPresenter;

import java.util.HashMap;

public interface DisputeIPresenter<V extends DisputeIView> extends MvpPresenter<V> {

    void dispute(HashMap<String, Object> obj);

    void getDispute();
}
