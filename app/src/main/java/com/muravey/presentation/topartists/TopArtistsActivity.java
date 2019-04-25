package com.muravey.presentation.topartists;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;



public class TopArtistsActivity extends AppCompatActivity {

    private ITopArtistsContract.Presenter mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TopArtistsFragment fragment = TopArtistsFragment.newInstance();

        getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content,fragment)
                .commit();
        mPresenter = new TopArtistsPresenter();
        mPresenter.attachView(fragment);

    }

}
