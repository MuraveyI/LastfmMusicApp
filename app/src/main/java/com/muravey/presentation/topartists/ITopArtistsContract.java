package com.muravey.presentation.topartists;

import com.muravey.core.mvp.ICoreMvpContract;
import com.muravey.model.TrackArtist;

import java.util.List;

public interface ITopArtistsContract {
    interface View extends ICoreMvpContract.View<Presenter> {

        void showArtists(List<TrackArtist> artists);

        void openArtist (TrackArtist artist);

        void showError();


    }

    interface Presenter extends ICoreMvpContract.Presenter<View> {
        void onArtistsClick(int position);

        void getArtists();

    }
}
