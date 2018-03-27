package com.study.collura.reactivexstudy.mvp.main;


import android.util.Log;

import com.study.collura.reactivexstudy.mvp.base.BasePresenter;

import rx.Subscriber;

public class AppMainActivityPresenter
        extends BasePresenter<AppMainActivity >
        implements  MainActivityPresenter {

    private AppMainActivityModel model;
    private Subscriber<String> dataCallback;

    public AppMainActivityPresenter (AppMainActivity view) {
        super (view);
        model = new AppMainActivityModel ( this );
        model.getData ();
    }

    @Override
    public void getdata () {
        Log.i("Tag", model.dataCallback ());
    }
}
