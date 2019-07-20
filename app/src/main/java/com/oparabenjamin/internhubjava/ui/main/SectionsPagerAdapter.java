package com.oparabenjamin.internhubjava.ui.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.oparabenjamin.internhubjava.Examples;
import com.oparabenjamin.internhubjava.Outline;
import com.oparabenjamin.internhubjava.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0 :
                Outline tab1 = new Outline();
                return tab1;
            case 1 :
                Examples tab2 = new Examples();
                return tab2;
            default :
                return null;
        }
//        return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 :
                return "Outline";
            case 1 :
                return "Examples";
        }
//        return mContext.getResources().getString(TAB_TITLES[position]);
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}