package com.codedapp.driver.ui.activity.notification_manager;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.NotificationManager;

import java.util.List;

public interface NotificationManagerIView extends MvpView {

    void onSuccess(List<NotificationManager> managers);

    void onError(Throwable e);

}