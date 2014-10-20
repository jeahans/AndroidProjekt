package com.example.jeanette.androidprojekt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;


public class Spiltyper extends Activity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    Button spiltype1, spiltype2;
    SeekBar svaerhed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiltyper);

        spiltype1 = (Button) findViewById(R.id.hurtigtSpil);
        spiltype2 = (Button) findViewById(R.id.spilType2);
        svaerhed = (SeekBar) findViewById(R.id.seekBar);

        spiltype1.setOnClickListener(this);
        spiltype2.setOnClickListener(this);
        svaerhed.setOnSeekBarChangeListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.spiltyper, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v == spiltype1) {
            startActivity(new Intent(this, Kategorier.class));

        } else if (v == spiltype2) {

            startActivity(new Intent(this, Kategorier.class));

        }

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
