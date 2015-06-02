package com.flashgugu.paginationseekbar;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;

import com.flashgugu.library.widgets.paginationseekbar.PaginationSeekBar;

public class MainActivity extends ActionBarActivity implements ExampleFragment.OnFragmentInteractionListener {

    private static String TAG = "SeekBarTest";

    private PaginationSeekBar seekBar;
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViewPager();

        seekBar = (PaginationSeekBar)findViewById(R.id.test_seek_bar);

        viewpager.setCurrentItem(1);
        seekBar.setHapticFeedbackEnabled(true);
        seekBar.setOnProgressChangeListener(new PaginationSeekBar.OnProgressChangeListener() {

            @Override
            public void onProgressChanged(PaginationSeekBar seekBar, int value, boolean fromUser) {
                Log.d(TAG, "onProgressChanged");
            }

            @Override
            public void onStartTrackingTouch(PaginationSeekBar seekBar) {
                Log.d(TAG, "onStartTrackingTouch");

            }

            @Override
            public void onStopTrackingTouch(PaginationSeekBar seekBar) {
                Log.d(TAG, "onStopTrackingTouch");

            }

            @Override
            public void onPageChanged(PaginationSeekBar seekBar, int pageNum, boolean fromUser) {
                Log.d(TAG, "onPageChanged");
                viewpager.setCurrentItem(pageNum);
            }

            @Override
            public void onPrevPageChanged(PaginationSeekBar seekBar, int pageNum, boolean fromUser) {
                Log.d(TAG, "onPrevPageChanged//" + pageNum);
                viewpager.setCurrentItem(pageNum);

            }

            @Override
            public void onNextPageChanged(PaginationSeekBar seekBar, int pageNum, boolean fromUser) {
                Log.d(TAG, "onNextPageChanged//" + pageNum);
                viewpager.setCurrentItem(pageNum);

            }

            @Override
            public void onPrevLimitNotify() {
                Toast.makeText(this,"Not moveable", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void setViewPager() {
        viewpager = (ViewPager)findViewById(R.id.pager);
        viewpager.setAdapter(new ExamplePagerAdapter(getSupportFragmentManager()));

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private class ExamplePagerAdapter extends FragmentStatePagerAdapter{

        public ExamplePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return ExampleFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            return 10;
        }
    }
}
