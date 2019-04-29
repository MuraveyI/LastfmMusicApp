package com.muravey.data.tracks.local;

import com.muravey.data.tracks.ITracksRepository;
import com.muravey.model.TrackEntity;

import java.util.List;

public class TracksLocalStorage implements ITracksLocalStorage {
    @Override
    public void getTracks(ITracksRepository.TracksCallback callback) {

    }

    public void setTracks(List<TrackEntity> tracks){


    }
}
