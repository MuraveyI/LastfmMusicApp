package com.muravey.presentation.artist;

import com.muravey.core.mvp.CoreMvpPresenter;
import com.muravey.data.artist.IArtistsRepository;
import com.muravey.model.TrackArtist;

import java.util.List;

public class ArtistPresenter  extends CoreMvpPresenter<IArtistContract.View>
        implements  IArtistContract.Presenter{

    private IArtistsRepository repository;
    public ArtistPresenter (IArtistsRepository repository){
        this.repository = repository;
    }

    public ArtistPresenter() {

    }

    @Override
    public void getArtist() {

        repository.getArtists(new IArtistsRepository.ArtistsCallback() {
            @Override
            public void onSuccess(List<TrackArtist> artists) {
                if (mView !=null){
                    mView.showArtist(artists);
                }

            }

            @Override
            public void onFailure(String message) {
                if (mView !=null){
                    mView.showError();
                }

            }
        });

    }

    @Override
    public void onArtistClick() {




    }
}
