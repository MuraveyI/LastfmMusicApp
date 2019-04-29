package com.muravey.data.tracks;

import android.support.annotation.Nullable;

import com.muravey.model.TrackEntity;

import java.util.List;

public interface ITracksRepository  {

    @Nullable
    TrackEntity getTrack(int id); // синхроный
    void getTracks(TracksCallback callback); // асинхроный


        interface TracksCallback {
        void onSuccess(List<TrackEntity> tracks);

        void onFailure(String message);
    }
}
