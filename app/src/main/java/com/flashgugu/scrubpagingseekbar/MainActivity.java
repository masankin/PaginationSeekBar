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
        seekBar.setHapticFeedbackEnabled(true);
        seekBar.setMax(5);
        seekBar.setMin(1);

        seekBar.setOnProgressChangeListener(new DiscreteSeekBar.OnProgressChangeListener() {
            @Override
            public void onProgressChanged(DiscreteSeekBar seekBar, int value, boolean fromUser) {
                Log.d(TAG, Integer.toString(value));
                Log.d(TAG, Float.toString(seekBar.getX()));
                Log.d(TAG, Float.toString(seekBar.getY()));
                Log.d(TAG, Boolean.toString(fromUser));

            }

            @Override
            public void onStartTrackingTouch(DiscreteSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(DiscreteSeekBar seekBar) {

            }

            @Override
            public void onPageChanged(DiscreteSeekBar seekBar, int value, boolean fromUser) {
                Log.d(TAG, "prev or next");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
