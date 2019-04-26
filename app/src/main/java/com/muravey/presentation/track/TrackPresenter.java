package com.muravey.presentation.track;

import com.muravey.model.TrackEntity;
import com.muravey.presentation.toptracks.ITopTracksContract;

import java.util.ArrayList;

public class TrackPresenter implements ITrackContract.Presenter {

    ITopTracksContract.View mView;



    @Override
    public void openTrackClick(int position) {

    }

    @Override
    public void getTrack() {
        ArrayList<TrackEntity> trackEntities = new ArrayList<>();
        trackEntities.add(new TrackEntity());

        if (mView !=null){
            mView.openTrackDetails(trackEntities);
        }

    }


    @Override
    public void attachView(ITrackContract.View view) {
        mView = mView;
        mView.attachPresenter(this);
    }

    @Override
    public void detachView() {

    }
}
