package com.codedapp.user.ui.activity.notification_manager;

import com.codedapp.user.base.MvpPresenter;

public interface NotificationManagerIPresenter<V extends NotificationManagerIView> extends MvpPresenter<V> {
    void getNotificationManager();
}
