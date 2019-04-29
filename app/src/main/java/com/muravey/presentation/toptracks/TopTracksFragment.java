package com.muravey.presentation.toptracks;


import android.view.View;

import com.muravey.R;
import com.muravey.core.mvp.CoreMvpFragment;
import com.muravey.model.TrackEntity;

import java.util.ArrayList;
import java.util.List;

public class TopTracksFragment extends CoreMvpFragment<ITopTracksContract.Presenter>
        implements ITopTracksContract.View {


    public static TopTracksFragment newInstance(String s) {
        TopTracksFragment fragment = new TopTracksFragment();
        return fragment;
    }

    //region Contract
    @Override
    public void showTracks(List<TrackEntity> track) {

    }

    @Override
    public void showError() {

    }


    @Override
    public void openTrackDetails(ArrayList<TrackEntity> track) {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_top_traks;
    }

    @Override
    protected void initView(View view) {
        //todo init:

    }


    //endregion
}

