package com.muravey.presentation.topartists;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.muravey.R;
import com.muravey.model.TrackArtist;

import java.util.List;

public class TopArtistsActivity extends AppCompatActivity implements ITopArtistsContract.View{

    private ITopArtistsContract.Presenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_artists);
        mPresenter =  new TopArtistsPresenter();

    }

    @Override
    public void showArtists(List<TrackArtist> artists) {

    }

    @Override
    public void openArtists(TrackArtist artist) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void finish() {
        finish();
    }

    @Override
    public void attachPresenter(ITopArtistsContract.Presenter presenter) {

    }


}
