package com.muravey.data.artist.remote;

import com.muravey.data.artist.ArtistsRepository;

public interface IArtistsRemoteStorage {
    void getArtists(ArtistsRepository.ArtistsCallback callback);
}
