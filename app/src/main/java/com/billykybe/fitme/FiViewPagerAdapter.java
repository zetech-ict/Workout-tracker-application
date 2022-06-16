package com.billykybe.fitme;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FiViewPagerAdapter extends FragmentStatePagerAdapter {
    public FiViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        IntroFragment introFragment = new IntroFragment();
        Bundle bundle = new Bundle();
        position = position+1;
        bundle.putString("massage","Find Find the right workout for what you need"+position);

        introFragment.setArguments(bundle);

        return introFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}