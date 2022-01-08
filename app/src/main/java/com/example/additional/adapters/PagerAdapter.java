package com.example.additional.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.additional.page_one.PAgeOneFragment;
import com.example.additional.page_two.PageTwoFragment;

public class PagerAdapter extends FragmentStateAdapter {

    private final Fragment[] fragments = {new PAgeOneFragment(), new PageTwoFragment()};

    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments[position];
    }

    @Override
    public int getItemCount() {
        return fragments.length;
    }
}
