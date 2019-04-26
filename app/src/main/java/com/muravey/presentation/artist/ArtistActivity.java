package com.muravey.presentation.artist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.muravey.R;
import com.muravey.model.TrackArtist;

import java.util.List;

public class ArtistActivity extends AppCompatActivity implements IArtistContract.View {

    private IArtistContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        mPresenter = new ArtistPresenter();
        mPresenter.attachView(this);

    }

    @Override
    public void showArtist(List<TrackArtist> artist) {

    }

    @Override
    public void attachPresenter(IArtistContract.Presenter presenter) {

    }

    @Override
    public void finishView() {

    }
}