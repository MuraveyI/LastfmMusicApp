package com.muravey.presentation.main;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.muravey.presentation.topartists.TopArtistsFragment;
import com.muravey.presentation.topartists.TopArtistsPresenter;
import com.muravey.presentation.toptracks.TopTracksFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    private static final int NUM_ITEMS = 2;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return  TopTracksFragment.newInstance(" Top Tracks");
            case 1:
                return TopArtistsFragment.newInstance("Top Artist");
        }
        return null;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Top Tracks";
            case 1:
                return "Top Artist";

        }
        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
