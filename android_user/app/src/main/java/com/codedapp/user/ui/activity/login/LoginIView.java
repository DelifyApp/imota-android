package com.codedapp.user.ui.activity.login;

import com.codedapp.user.base.MvpView;
import com.codedapp.user.data.network.model.ForgotResponse;
import com.codedapp.user.data.network.model.Token;

public interface LoginIView extends MvpView {
    void onSuccess(Token token);

    void onSuccess(ForgotResponse object);

    void onError(Throwable e);
}
