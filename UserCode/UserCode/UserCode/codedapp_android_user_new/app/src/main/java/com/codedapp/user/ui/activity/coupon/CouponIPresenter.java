package com.codedapp.user.ui.activity.coupon;

import com.codedapp.user.base.MvpPresenter;

public interface CouponIPresenter<V extends CouponIView> extends MvpPresenter<V> {
    void coupon();
}
