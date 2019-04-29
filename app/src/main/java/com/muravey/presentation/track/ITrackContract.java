package com.muravey.presentation.track;

import com.muravey.core.mvp.ICoreMvpContract;
import com.muravey.model.TrackEntity;

import java.util.ArrayList;
import java.util.List;


public interface ITrackContract {

    interface View extends ICoreMvpContract.View<Presenter> {

        void showTracks(List<TrackEntity> trackEntities);
        void showError();


        void openTrackDetails(ArrayList<TrackEntity> trackEntities);

    }

    interface Presenter extends ICoreMvpContract.Presenter<View>{

        void getTrack();

        void openTrackClick(int position);


    }
}
