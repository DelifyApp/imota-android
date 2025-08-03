package com.codedapp.user.ui.activity.invite_friend;

import com.codedapp.user.base.MvpView;
import com.codedapp.user.data.network.model.User;

public interface InviteFriendIView extends MvpView {

    void onSuccess(User user);

    void onError(Throwable e);

}
