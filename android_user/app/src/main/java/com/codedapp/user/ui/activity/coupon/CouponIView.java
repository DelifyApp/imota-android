package com.codedapp.user.ui.activity.coupon;

import com.codedapp.user.base.MvpView;
import com.codedapp.user.data.network.model.PromoResponse;

public interface CouponIView extends MvpView {
    void onSuccess(PromoResponse object);

    void onError(Throwable e);
}
