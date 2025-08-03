package com.codedapp.user.ui.fragment.service;

import com.codedapp.user.base.MvpView;
import com.codedapp.user.data.network.model.Service;

import java.util.List;

public interface ServiceTypesIView extends MvpView {

    void onSuccess(List<Service> serviceList);

    void onError(Throwable e);

    void onSuccess(Object object);
}
