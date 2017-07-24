package com.example.mudit.trip;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mudit on 6/7/17.
 */

public class TripFragmentPagerAdapter extends FragmentPagerAdapter {

    Context tContext;

    public TripFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        tContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SightsFragment();
            case 1:
                return new DiningFragment();
            case 2:
                return new ShoppingFragment();
            case 3:
                return new HotelsFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return tContext.getString(R.string.sights);
            case 1:
                return tContext.getString(R.string.dining);
            case 2:
                return tContext.getString(R.string.shopping);
            case 3:
                return tContext.getString(R.string.hotels);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
