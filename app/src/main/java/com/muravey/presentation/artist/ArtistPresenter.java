package com.muravey.presentation.artist;

import com.muravey.model.TrackArtist;

import java.util.ArrayList;

public class ArtistPresenter  implements  IArtistContract.Presenter{

    private IArtistContract.View mView;



    @Override
    public void attachView(IArtistContract.View view) {
        mView = mView;
        mView.attachPresenter(this);

    }

    @Override
    public void detachView() {
        mView = null;

    }

    @Override
    public void getArtist() {

    }

    @Override
    public void onArtistClick() {
        ArrayList<TrackArtist> trackArtists = new ArrayList<>();
        trackArtists.add(new TrackArtist());

        if (mView !=null){
            mView.showArtist(trackArtists);
        }



    }
}
