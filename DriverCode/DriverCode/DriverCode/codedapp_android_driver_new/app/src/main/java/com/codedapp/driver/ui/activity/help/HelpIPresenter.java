package com.codedapp.driver.ui.activity.help;


import com.codedapp.driver.base.MvpPresenter;

public interface HelpIPresenter<V extends HelpIView> extends MvpPresenter<V> {

    void getHelp();
}
