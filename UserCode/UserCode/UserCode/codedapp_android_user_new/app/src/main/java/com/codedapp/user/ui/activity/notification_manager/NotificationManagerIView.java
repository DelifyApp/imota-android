package com.codedapp.user.ui.activity.notification_manager;

import com.codedapp.user.base.MvpView;
import com.codedapp.user.data.network.model.NotificationManager;

import java.util.List;

public interface NotificationManagerIView extends MvpView {

    void onSuccess(List<NotificationManager> notificationManager);

    void onError(Throwable e);

}