package com.codedapp.driver.ui.activity.invite_friend;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.UserResponse;

public interface InviteFriendIView extends MvpView {

    void onSuccess(UserResponse response);
    void onError(Throwable e);

}
