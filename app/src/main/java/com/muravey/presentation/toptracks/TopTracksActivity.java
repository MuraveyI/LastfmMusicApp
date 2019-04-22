package com.muravey.presentation.toptracks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.muravey.R;
import com.muravey.model.TrackEntity;

import java.util.List;

public class TopTracksActivity extends AppCompatActivity
implements ITopTracksContract.View{

    private ITopTracksContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_traks);

        mPresenter = new TopTracksPresenter();
        mPresenter.attachView(this);
    }

    @Override
    public void showTracks(List<TrackEntity> track) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void openTrack(TrackEntity track) {

    }

    @Override
    public void finish() {

    }

    @Override
    public void attachPresenter(ITopTracksContract.Presenter presenter) {

    }
}
