package com.muravey.data.tracks.local;

import com.muravey.data.tracks.ITracksRepository;
import com.muravey.model.TrackEntity;

import java.util.List;

public interface ITracksLocalStorage {
    void getTracks (ITracksRepository.TracksCallback callback);

    void setTracks(List<TrackEntity> tracks);
}
