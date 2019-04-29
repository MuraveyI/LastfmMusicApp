package com.muravey.data.artist.local;

import com.muravey.data.artist.IArtistsRepository;
import com.muravey.model.TrackArtist;

import java.util.List;

public interface IArtistsLocalStorage {

    void getArtist(IArtistsRepository.ArtistsCallback callback);
    void setArtists(List<TrackArtist> artists);
}
