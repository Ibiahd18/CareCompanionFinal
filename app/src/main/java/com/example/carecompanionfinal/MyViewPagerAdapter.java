package com.example.carecompanionfinal;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.carecompanionfinal.healthTipFragments.ApptFreqFragment;
import com.example.carecompanionfinal.healthTipFragments.DietFragment;
import com.example.carecompanionfinal.healthTipFragments.ExerciseFragment;
import com.example.carecompanionfinal.healthTipFragments.TopTipsFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new TopTipsFragment();
            case 1:
                return new ExerciseFragment();
            case 2:
                return new DietFragment();
            case 3:
                return new ApptFreqFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }


}
