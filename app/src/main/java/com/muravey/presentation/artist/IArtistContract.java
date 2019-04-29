package com.muravey.presentation.artist;


import com.muravey.core.mvp.ICoreMvpContract;
import com.muravey.model.TrackArtist;

import java.util.List;

public interface IArtistContract  {

    interface View extends ICoreMvpContract.View<Presenter> {

        void showArtist(List<TrackArtist>artist);

        void showError();


    }

    interface Presenter extends ICoreMvpContract.Presenter<View> {

        void getArtist();

        void onArtistClick();

    }


}
