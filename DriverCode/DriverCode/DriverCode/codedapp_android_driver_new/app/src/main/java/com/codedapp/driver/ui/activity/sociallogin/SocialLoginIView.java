package com.codedapp.driver.ui.activity.sociallogin;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.Token;

public interface SocialLoginIView extends MvpView {

    void onSuccess(Token token);
    void onError(Throwable e);
}
