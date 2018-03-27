package com.study.collura.reactivexstudy.mvp.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.study.collura.reactivexstudy.R;

public class AppMainActivity extends AppCompatActivity {

  private AppMainActivityPresenter presenter;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        presenter = new AppMainActivityPresenter ( this );
        presenter.getdata ();
    }
}
