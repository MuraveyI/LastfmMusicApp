package com.muravey.presentation.track;

import com.muravey.core.mvp.ICoreMvpContract;
import com.muravey.model.TrackEntity;

import java.util.List;

public interface ITrackContract {

    interface View extends ICoreMvpContract.View<Presenter> {

        void showTrack(List<TrackEntity> track);

        void openTrackDetails(int id);

        void showMessage(String message);


    }

    interface Presenter extends ICoreMvpContract.Presenter<View>{

        void openTrackClick(int position);

        void getTrack();


    }
}
