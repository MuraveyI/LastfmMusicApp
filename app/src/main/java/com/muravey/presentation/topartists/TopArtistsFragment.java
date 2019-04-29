package com.muravey.presentation.topartists;
import android.view.View;
import com.muravey.R;
import com.muravey.core.mvp.CoreMvpFragment;
import com.muravey.model.TrackArtist;

import java.util.List;

public class TopArtistsFragment extends CoreMvpFragment<ITopArtistsContract.Presenter> implements ITopArtistsContract.View {

    public static TopArtistsFragment newInstance(String topartist){
        TopArtistsFragment fragment = new TopArtistsFragment();
        return fragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_top_artists;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    public void showArtists(List<TrackArtist> artists) {

    }

    @Override
    public void openArtist(TrackArtist artist) {

    }

    @Override
    public void showError() {

    }



}
