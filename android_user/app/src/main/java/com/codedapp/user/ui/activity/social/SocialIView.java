package com.codedapp.user.ui.activity.social;

import com.codedapp.user.base.MvpView;
import com.codedapp.user.data.network.model.Token;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface SocialIView extends MvpView {
    void onSuccess(Token token);

    void onError(Throwable e);
}
