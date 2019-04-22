package com.muravey.presentation.topartists;

import com.muravey.core.CoreMvpContract;
import com.muravey.model.TrackArtist;

import java.util.List;

public interface ITopArtistsContract {
    interface View extends CoreMvpContract{

        void showArtists(List<TrackArtist> artists);
        void openArtists(TrackArtist artist);
        void showMessage(String message);

        void finish();

        void attachPresenter(ITopArtistsContract.Presenter presenter);
    }

    interface Presenter extends CoreMvpContract{
        void onArtistsClick(int position);
        void getArtists();


    }
}
