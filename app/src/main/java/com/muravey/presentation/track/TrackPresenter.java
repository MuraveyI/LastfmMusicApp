package com.muravey.presentation.track;

import com.muravey.core.mvp.CoreMvpPresenter;
import com.muravey.data.tracks.ITracksRepository;
import com.muravey.model.TrackEntity;
import java.util.List;

public class TrackPresenter extends CoreMvpPresenter<ITrackContract.View>
        implements ITrackContract.Presenter {

   private ITracksRepository repository;

   public TrackPresenter (ITracksRepository repository){
       this.repository =repository;
   }

    public TrackPresenter() {

    }


    @Override
    public void openTrackClick(int position) {

    }

    @Override
    public void getTrack() {

       repository.getTracks(new ITracksRepository.TracksCallback() {
           @Override
           public void onSuccess(List<TrackEntity> tracks) {

               if (mView !=null){
                   mView.showTracks(tracks);
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
