package com.muravey.presentation.toptracks;

import com.muravey.core.mvp.ICoreMvpContract;
import com.muravey.model.TrackEntity;
import com.muravey.presentation.track.TrackPresenter;

import java.util.ArrayList;
import java.util.List;

public interface ITopTracksContract {

    interface View extends ICoreMvpContract.View<Presenter> {

        void showTracks(List<TrackEntity> track);


        void showError();

        void openTrackDetails(ArrayList<TrackEntity> track);

        void attachPresenter(TrackPresenter trackPresenter);
    }

    interface Presenter extends ICoreMvpContract.Presenter<View> {


        void onTracksClick(int position);

        void getTracks();


    }
}
