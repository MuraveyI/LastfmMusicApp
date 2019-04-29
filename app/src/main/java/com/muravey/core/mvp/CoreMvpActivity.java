package com.muravey.core.mvp;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public abstract class CoreMvpActivity<T extends ICoreMvpContract.Presenter>
        extends AppCompatActivity implements ICoreMvpContract.View<T>{

    @Nullable
    protected T  mPresenter;

    @LayoutRes
    protected abstract int getLayout();
    protected abstract void initView();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(getLayout());
        super.onCreate(savedInstanceState);
        mPresenter.attachView(this);
        initView();
    }

    @Override
    public void attachPresenter(ICoreMvpContract.Presenter presenter) {
        mPresenter.attachView(this);

    }

    @Override
    public void finishView() {
        mPresenter = null;

    }
}
