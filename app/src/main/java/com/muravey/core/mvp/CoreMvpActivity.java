package com.muravey.core.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class CoreMvpActivity extends AppCompatActivity implements ICoreMvpContract.View{
    private ICoreMvpContract.Presenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter =  new CoreMvpPresenter();
        mPresenter.attachView(this);
    }

    @Override
    public void attachPresenter(ICoreMvpContract.Presenter presenter) {
        mPresenter = mPresenter;
        mPresenter.attachView(this);

    }

    @Override
    public void finishView() {
        mPresenter = null;

    }
}
