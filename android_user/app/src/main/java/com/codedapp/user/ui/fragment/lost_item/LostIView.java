package com.codedapp.user.ui.fragment.lost_item;

import com.codedapp.user.base.MvpView;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface LostIView extends MvpView{
    void onSuccess(Object object);
    void onError(Throwable e);
}
