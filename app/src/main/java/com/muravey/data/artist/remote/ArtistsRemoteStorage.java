package com.muravey.data.artist.remote;

import com.muravey.data.artist.ArtistsRepository;
import com.muravey.model.TrackArtist;

import java.util.ArrayList;

public class ArtistsRemoteStorage {
    void getArtists(ArtistsRepository.ArtistsCallback callback) {
        ArrayList<TrackArtist> artists = new ArrayList<>();
        artists.add(new TrackArtist());
        artists.add(new TrackArtist());
        artists.add(new TrackArtist());
        artists.add(new TrackArtist());

        callback.onSuccess(artists);
    }
}
