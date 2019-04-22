package com.muravey.presentation.toptracks;

import com.muravey.model.TrackEntity;

import java.util.List;

public interface ITopTracksContract {

    interface View{

        void showTracks(List<TrackEntity> track);

        void showMessage(String message);

        void openTrack( TrackEntity track);

        void finish();

        void attachPresenter(Presenter presenter);

    }

    interface Presenter{


        void onTracksClick(int position);

        void getTracks();

        void attachView(View view);

        void detachView();
    }
}
