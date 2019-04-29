package com.muravey.data.artist;

import android.support.annotation.Nullable;

import com.muravey.model.TrackArtist;

import java.util.List;

public interface IArtistsRepository {

    @Nullable
    TrackArtist getArtist(int id);
    void getArtists(ArtistsCallback callback);

    interface ArtistsCallback{
        void onSuccess(List<TrackArtist>artists);
        void onFailure(String message);
    }
}
