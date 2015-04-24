package com.flashgugu.scrubpagingseekbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;

import com.flashgugu.library.widgets.scrubpagingseekbar.ScrubPagingSeekBar;

import org.adw.library.widgets.discreteseekbar.DiscreteSeekBar;

public class MainActivity extends ActionBarActivity {

    private static String TAG = "SeekBarTest";

    ScrubPagingSeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (ScrubPagingSeekBar)findViewById(R.id.test_seek_bar);
        seekBar.setPagecountPerOneboard(1,5);
        seekBar.setHapticFeedbackEnabled(true);
        seekBar.setOnProgressChangeListener(new DiscreteSeekBar.OnProgressChangeListener() {
            @Override
            public void onProgressChanged(DiscreteSeekBar seekBar, int value, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(DiscreteSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(DiscreteSeekBar seekBar) {

            }

            @Override
            public void onPageChanged(DiscreteSeekBar seekBar, int value, boolean fromUser) {
                Log.d(TAG, "onPageChanged");
            }

            @Override
            public void onPrevPageChanged(DiscreteSeekBar seekBar, boolean fromUser) {
                Log.d(TAG, "onPrevPageChanged");
            }

            @Override
            public void onNextPageChanged(DiscreteSeekBar seekBar, boolean fromUser) {
                Log.d(TAG, "onNextPageChanged");
            }
        });

    }
}
