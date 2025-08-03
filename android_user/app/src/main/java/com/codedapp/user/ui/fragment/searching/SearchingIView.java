package com.codedapp.user.ui.fragment.searching;

import com.codedapp.user.base.MvpView;

public interface SearchingIView extends MvpView {
    void onSuccess(Object object);

    void onError(Throwable e);
}
