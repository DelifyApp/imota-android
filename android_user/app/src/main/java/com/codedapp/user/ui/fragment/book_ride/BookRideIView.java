package com.codedapp.user.ui.fragment.book_ride;

import com.codedapp.user.base.MvpView;
import com.codedapp.user.data.network.model.PromoResponse;


public interface BookRideIView extends MvpView {
    void onSuccess(Object object);

    void onError(Throwable e);

    void onSuccessCoupon(PromoResponse promoResponse);
}
