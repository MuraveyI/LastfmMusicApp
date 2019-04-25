package com.muravey.presentation.track;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.muravey.R;
import com.muravey.model.TrackEntity;

import java.util.List;

public class TrackActivity extends AppCompatActivity implements ITrackContract.View {

    private ITrackContract.Presenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);
        mPresenter = new TrackPresenter();
        mPresenter.attachView(this);


    }

    @Override
    public void showTrack(List<TrackEntity> track) {

    }

    @Override
    public void openTrackDetails(int id) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void attachPresenter(ITrackContract.Presenter presenter) {
        mPresenter =  presenter;

    }

    @Override
    public void finishView() {

    }

    @Override
    public void finish() {
        finish();
    }
}
