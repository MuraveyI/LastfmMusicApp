package com.muravey.data.tracks.remote;

import com.muravey.data.tracks.ITracksRepository;

public interface ITracksRemoteStorage {
    void getTracks (ITracksRepository.TracksCallback callback);

}
