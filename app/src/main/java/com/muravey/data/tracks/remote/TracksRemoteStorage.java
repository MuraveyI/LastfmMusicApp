package com.muravey.data.tracks.remote;

import com.muravey.data.tracks.ITracksRepository;
import com.muravey.model.TrackEntity;

import java.util.ArrayList;

public class TracksRemoteStorage implements ITracksRemoteStorage {
    @Override
    public void getTracks(ITracksRepository.TracksCallback callback) {
        ArrayList<TrackEntity> trackEntities = new ArrayList<>();
        trackEntities.add(new TrackEntity());
        trackEntities.add(new TrackEntity());
        trackEntities.add(new TrackEntity());
        trackEntities.add(new TrackEntity());

        callback.onSuccess(trackEntities);

    }
}
