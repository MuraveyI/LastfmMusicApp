package com.muravey.presentation.toptracks;

import com.muravey.core.mvp.ICoreMvpContract;
import com.muravey.model.TrackEntity;

import java.util.List;

public interface ITopTracksContract {

    interface View extends ICoreMvpContract.View<Presenter> {

        void showTracks(List<TrackEntity> track);


        void showError();

        void openTrackDetails( TrackEntity track);

    }

    interface Presenter extends ICoreMvpContract.Presenter<View> {


        void onTracksClick(int position);

        void getTracks();


    }
}
