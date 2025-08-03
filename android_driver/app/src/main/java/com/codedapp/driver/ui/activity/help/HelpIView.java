package com.codedapp.driver.ui.activity.help;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.Help;

public interface HelpIView extends MvpView {

    void onSuccess(Help object);

    void onError(Throwable e);
}
