package com.flashgugu.paginationseekbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.flashgugu.library.widgets.paginationseekbar.PaginationSeekBar;

public class MainActivity extends ActionBarActivity {

    private static String TAG = "SeekBarTest";

    PaginationSeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (PaginationSeekBar)findViewById(R.id.test_seek_bar);

        seekBar.setPagecountPerOneboard(10);
        seekBar.setHapticFeedbackEnabled(true);
        seekBar.setOnProgressChangeListener(new PaginationSeekBar.OnProgressChangeListener() {
            @Override
            public void onProgressChanged(PaginationSeekBar seekBar, int value, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(PaginationSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(PaginationSeekBar seekBar) {

            }

            @Override
            public void onPageChanged(PaginationSeekBar seekBar, int value, boolean fromUser) {
            }

            @Override
            public void onPrevPageChanged(PaginationSeekBar seekBar, boolean fromUser) {
            }

            @Override
            public void onNextPageChanged(PaginationSeekBar seekBar, boolean fromUser) {
            }
        });

    }
}
