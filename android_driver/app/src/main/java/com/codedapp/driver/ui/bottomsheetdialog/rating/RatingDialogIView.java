package com.codedapp.driver.ui.bottomsheetdialog.rating;

import com.codedapp.driver.base.MvpView;
import com.codedapp.driver.data.network.model.Rating;

public interface RatingDialogIView extends MvpView {

    void onSuccess(Rating rating);
    void onError(Throwable e);
}
