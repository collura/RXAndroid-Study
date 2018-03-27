package com.study.collura.reactivexstudy.mvp.base;

/**
 * Created by Betto on 27/03/2018.
 */

public abstract class BaseModel<T> {
    protected T presenter;

    public BaseModel (T presenter) {
        this.presenter = presenter;
    }
}
