package com.codedapp.user.ui.activity.help;

import com.codedapp.user.base.MvpView;
import com.codedapp.user.data.network.model.Help;

public interface HelpIView extends MvpView {

    void onSuccess(Help help);

    void onError(Throwable e);
}
