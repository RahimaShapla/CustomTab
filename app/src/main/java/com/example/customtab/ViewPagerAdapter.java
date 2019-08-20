package com.example.customtab;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.w3e.core.newsapp2.helper.Constants;
import com.w3e.core.newsapp2.ui.recentread.UserRecentReadFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private int tabCount;

    public ViewPagerAdapter(FragmentManager fm, Context context, int totalTab) {
        super(fm);
        this.context = context;
        this.tabCount = totalTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                UserRecentReadFragment readFragment = new UserRecentReadFragment();
                readFragment.setFragmentType(Constants.TabIndex.RECENTLY_READ);
                return readFragment;
            case 1:
                UserRecentReadFragment savedFragment = new UserRecentReadFragment();
                savedFragment.setFragmentType(Constants.TabIndex.SAVED);
                return savedFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
