package com.codedapp.driver.ui.activity.main;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.Help;
import com.codedapp.driver.data.network.model.SettingsResponse;
import com.codedapp.driver.data.network.model.TripResponse;
import com.codedapp.driver.data.network.model.UserResponse;

public interface MainIView extends MvpView {
    void onSuccess(UserResponse user);

    void onError(Throwable e);

    void onSuccessLogout(Object object);

    void onSuccess(TripResponse tripResponse);

    void onSuccess(SettingsResponse response);

    void onSettingError(Throwable e);

    void onSuccessProviderAvailable(Object object);

    void onSuccessFCM(Object object);

    void onSuccessLocationUpdate(TripResponse tripResponse);

    void onSuccess(Help help);
}
