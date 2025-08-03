package com.codedapp.user.ui.activity.card;

import com.codedapp.user.base.MvpPresenter;


public interface CarsIPresenter<V extends CardsIView> extends MvpPresenter<V> {
    void card();
}
