package com.muravey.presentation.track;

import com.muravey.core.CoreMvpContract;
import com.muravey.model.TrackEntity;

import java.util.List;

public interface ITrackContract {
    interface View extends CoreMvpContract.View<Presenter>{
        void showTrack(List<TrackEntity> track);

        void openTrackDetails(int id);

    }

    interface Presenter extends CoreMvpContract.Presenter<View>{
        void openTrackClick(int position);


        void getTrack();

    }
}
