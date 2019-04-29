package com.muravey.core.mvp;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class CoreMvpFragment<T extends ICoreMvpContract.Presenter> extends Fragment
        implements ICoreMvpContract.View<T> {


    @Nullable
    protected T  mPresenter;

    @LayoutRes
    protected abstract int getLayout();
    protected abstract void initView(View view);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayout(), container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    @Override
    public void attachPresenter(T mPresenter) {
    this.mPresenter = mPresenter;
    }

    @Override
    public void finishView() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }
}
