package com.muravey.data.tracks;

import android.support.annotation.Nullable;

import com.muravey.data.tracks.local.ITracksLocalStorage;
import com.muravey.data.tracks.local.TracksLocalStorage;
import com.muravey.data.tracks.remote.ITracksRemoteStorage;
import com.muravey.data.tracks.remote.TracksRemoteStorage;
import com.muravey.model.TrackEntity;

import java.util.List;

public class TracksRepository implements ITracksRepository {

    @Nullable
    private ITracksLocalStorage local;
    @Nullable
    private ITracksRemoteStorage remote;


    public TracksRepository(
            @Nullable TracksLocalStorage local,
            @Nullable TracksRemoteStorage remote
    ){
        this.local =  local;
        this.remote = remote;

    }

    @Nullable
    @Override
    public TrackEntity getTrack(int id) {
        return null;
    }

    @Override
    public void getTracks(final TracksCallback callback) {
        local.getTracks(callback);

        remote.getTracks(new TracksCallback() {
            @Override
            public void onSuccess(List<TrackEntity> tracks) {
                local.setTracks(tracks);
                callback.onSuccess(tracks);
            }

            @Override
            public void onFailure(String message) {
                callback.onFailure(message);

            }
        });

    }
}
