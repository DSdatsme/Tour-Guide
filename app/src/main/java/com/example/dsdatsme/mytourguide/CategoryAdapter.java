package com.example.dsdatsme.mytourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dsdatsme.mytourguide.fragments.AmusementFragment;
import com.example.dsdatsme.mytourguide.fragments.FoodFragment;
import com.example.dsdatsme.mytourguide.fragments.HotelFragment;
import com.example.dsdatsme.mytourguide.fragments.PlaceFragment;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Nullable
    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new FoodFragment();
        else if (position == 1)
            return new HotelFragment();
        else if (position == 2)
            return  new AmusementFragment();
        else
            return new PlaceFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.title_food);
        else if (position == 1)
            return mContext.getString(R.string.title_hotel);
        else if (position == 2)
            return mContext.getString(R.string.title_amusement);
        else
            return mContext.getString(R.string.title_place);
    }
}
