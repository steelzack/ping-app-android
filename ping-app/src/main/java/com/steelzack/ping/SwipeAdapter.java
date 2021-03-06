package com.steelzack.ping;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by joao on 10-1-16.
 */
public class SwipeAdapter extends FragmentStatePagerAdapter{

    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0: fragment = new PingFragment(); break;
            case 1: fragment = new TraceRouteFragment(); break;
            default:break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
