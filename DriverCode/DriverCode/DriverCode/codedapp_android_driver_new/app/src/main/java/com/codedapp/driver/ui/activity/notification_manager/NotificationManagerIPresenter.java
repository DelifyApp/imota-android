package com.codedapp.driver.ui.activity.notification_manager;

import com.codedapp.driver.base.MvpPresenter;

public interface NotificationManagerIPresenter<V extends NotificationManagerIView> extends MvpPresenter<V> {
    void getNotificationManager();
}
