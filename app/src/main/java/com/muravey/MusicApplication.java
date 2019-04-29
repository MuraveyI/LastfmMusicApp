package com.muravey;

import android.app.Application;

import com.muravey.data.tracks.ITracksRepository;

public class MusicApplication extends Application {
    public static ITracksRepository iTracksRepository;


    @Override
    public void onCreate() {
        super.onCreate();

    }
}
