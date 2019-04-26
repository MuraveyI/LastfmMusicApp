package com.muravey.presentation.topartists;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muravey.R;
import com.muravey.model.TrackArtist;

import java.util.List;

public class TopArtistsFragment extends Fragment implements ITopArtistsContract.View {

    private ITopArtistsContract.Presenter mPresenter;

    public static TopArtistsFragment newInstance(String top_artist){
        TopArtistsFragment fragment = new TopArtistsFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.artists_fragment, container, false);
        return view;
    }

    @Override
    public void showArtists(List<TrackArtist> artists) {

    }

    @Override
    public void openArtist(TrackArtist artist) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void attachPresenter(ITopArtistsContract.Presenter presenter) {

    }

    @Override
    public void finishView() {

    }
}
