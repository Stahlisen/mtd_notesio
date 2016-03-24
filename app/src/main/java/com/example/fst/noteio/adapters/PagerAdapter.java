package com.example.fst.noteio.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.fst.noteio.TabOneFragment;

/**
 * Created by fst on 2016-03-24.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.mNumOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabOneFragment tab1 = new TabOneFragment();
                return tab1;
            case 1:
                TabOneFragment tab2 = new TabOneFragment();
                return tab2;
            case 2: TabOneFragment tab3 = new TabOneFragment();
                return tab3;
            default:
                return null;

        }
    }


    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
