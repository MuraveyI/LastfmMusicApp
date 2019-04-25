package com.muravey.presentation.toptracks;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muravey.R;
import com.muravey.model.TrackEntity;

import java.util.List;

public class TopTracksFragment extends Fragment implements ITopTracksContract.View {

    private ITopTracksContract.Presenter  mpresenter;

    public static TopTracksFragment newInstance() {
        TopTracksFragment fragment = new TopTracksFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tracks_fragment, container, false);
        return view;
    }

    //region Contract
    @Override
    public void showTracks(List<TrackEntity> track) {

    }

    @Override
    public void showError() {

    }


    @Override
    public void openTrackDetails(TrackEntity track) {

    }


    @Override
    public void attachPresenter(ITopTracksContract.Presenter presenter) {
        mpresenter = presenter;

    }

    @Override
    public void finishView() {
        getActivity().finish();

    }
    //endregion
}
