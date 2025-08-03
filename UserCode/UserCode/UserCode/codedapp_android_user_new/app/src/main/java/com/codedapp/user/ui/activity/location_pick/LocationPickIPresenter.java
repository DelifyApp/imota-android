package com.codedapp.user.ui.activity.location_pick;

import com.codedapp.user.base.MvpPresenter;

public interface LocationPickIPresenter<V extends LocationPickIView> extends MvpPresenter<V> {
    void address();
}
