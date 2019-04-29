package com.muravey.presentation.topartists;

import com.muravey.core.mvp.CoreMvpPresenter;
import com.muravey.data.artist.IArtistsRepository;
import com.muravey.model.TrackArtist;

import java.util.List;

public class TopArtistsPresenter extends CoreMvpPresenter<ITopArtistsContract.View>
        implements ITopArtistsContract.Presenter {

    private IArtistsRepository repository;

    public TopArtistsPresenter (IArtistsRepository repository){
        this.repository = repository;
    }

    public TopArtistsPresenter() {

    }


    @Override
    public void onArtistsClick(int position) {

    }

    @Override
    public void getArtists() {
        repository.getArtists(new IArtistsRepository.ArtistsCallback() {
            @Override
            public void onSuccess(List<TrackArtist> artists) {
                if (mView != null){
                    mView.showArtists(artists);
                }
            }

            @Override
            public void onFailure(String message) {

                if (mView != null){
                    mView.showError();
                }
            }
        });

    }

}
