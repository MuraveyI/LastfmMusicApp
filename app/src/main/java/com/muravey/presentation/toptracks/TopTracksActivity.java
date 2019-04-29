package com.muravey.presentation.toptracks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.muravey.data.tracks.ITracksRepository;

public class TopTracksActivity extends AppCompatActivity {

    private ITopTracksContract.Presenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        TopTracksFragment fragment =  TopTracksFragment.newInstance("Top Tracks");

        getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, fragment)
                .commit();
        mPresenter =  new TopTracksPresenter();
        mPresenter.attachView(fragment);

    }
}
