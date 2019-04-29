package com.muravey.presentation.toptracks;

import com.muravey.core.mvp.CoreMvpPresenter;
import com.muravey.data.tracks.ITracksRepository;
import com.muravey.model.TrackEntity;

import java.util.List;

public class TopTracksPresenter extends CoreMvpPresenter<ITopTracksContract.View>
        implements ITopTracksContract.Presenter {

    private ITracksRepository repository;


    public TopTracksPresenter(ITracksRepository repository) {
        this.repository = repository;

    }

    public TopTracksPresenter() {
    }


    @Override
    public void getTracks() {
        repository.getTracks(new ITracksRepository.TracksCallback() {
            @Override
            public void onSuccess(List<TrackEntity> tracks) {

                if (mView != null) {
                    mView.showTracks(tracks);
                }
            }

            @Override
            public void onFailure(String message) {
                if (mView != null){
                    mView.showError( );
                }

            }
        });
    }

    @Override
    public void onTracksClick(int position) {

    }
}
