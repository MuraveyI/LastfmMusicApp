package com.muravey.data.artist;

import android.support.annotation.Nullable;

import com.muravey.data.artist.local.IArtistsLocalStorage;
import com.muravey.data.artist.remote.IArtistsRemoteStorage;
import com.muravey.data.tracks.local.ITracksLocalStorage;
import com.muravey.model.TrackArtist;

import java.util.List;

public class ArtistsRepository implements IArtistsRepository {
    @Nullable
    IArtistsLocalStorage local;
    @Nullable
    IArtistsRemoteStorage remote;


    public ArtistsRepository(
        IArtistsLocalStorage local,
        IArtistsRemoteStorage remote
    ){

        this.local = local;
        this.remote = remote;
    }


    @Nullable
    @Override
    public TrackArtist getArtist(int id) {
        return null;
    }

    @Override
    public void getArtists(final ArtistsCallback callback) {
        local.getArtist(callback);
        remote.getArtists(new ArtistsCallback() {
            @Override
            public void onSuccess(List<TrackArtist> artists) {
                local.setArtists(artists);
                callback.onSuccess(artists);
            }

            @Override
            public void onFailure(String message) {
                callback.onFailure(message);

            }
        });


    }
}
