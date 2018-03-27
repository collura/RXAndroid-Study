package com.study.collura.reactivexstudy.mvp.base;

/**
 * Created by Betto on 27/03/2018.
 */

public class BasePresenter<T> {
    protected T view;

    public BasePresenter (T view) {
        this.view = view;
    }
}
