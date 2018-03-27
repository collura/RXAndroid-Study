package com.study.collura.reactivexstudy.mvp.main;

import android.util.Log;

import com.study.collura.reactivexstudy.mvp.base.BaseModel;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by Betto on 27/03/2018.
 */

public class AppMainActivityModel
        extends BaseModel<AppMainActivityPresenter>
        implements  MainActivityModel
        {

    private String data =  "data";
    private Observable<String> observer;
    private Subscriber<String> subscriber;

    public AppMainActivityModel (AppMainActivityPresenter presenter) {
        super (presenter);

        subscriber = new Subscriber < String > () {
            @Override
            public void onCompleted () {  Log.i ("Tag", "onCompleted"); }

            @Override
            public void onError (Throwable e) {  Log.i ("Tag", "onError");   }

            @Override
            public void onNext (String s) {
                dataCallback ();
            }
        };
        observer ().subscribe ( subscriber );
    }


    public Observable<String> observer () {
        return Observable.just ( getData () );
    }

    String getData(){
        return data;
    }

    String dataCallback( ){
        return data;
    }

}
