package com.example.jeanette.androidprojekt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Kategorier extends Activity implements View.OnClickListener {

    Button kat1, kat2, kat3, kat4, venner, nyKat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorier);

        kat1 = (Button) findViewById(R.id.kat1);
        kat2 = (Button) findViewById(R.id.kat2);
        kat3 = (Button) findViewById(R.id.kat3);
        kat4 = (Button) findViewById(R.id.kat4);
        venner = (Button) findViewById(R.id.katVenner);
        nyKat = (Button) findViewById(R.id.nyKat);

        kat1.setOnClickListener(this);
        kat2.setOnClickListener(this);
        kat3.setOnClickListener(this);
        kat4.setOnClickListener(this);
        venner.setOnClickListener(this);
        nyKat.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.kategorier, menu);
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
        if (v == kat1) {
            Intent intent = new Intent(this, Spillet.class);
            String s = (String) kat1.getText();
            intent.putExtra("Kategori", s);
            startActivity(intent);
            //Her skal spillet startes med et tilfældigt billede i denne kategori

        } else if (v == kat2) {
            Intent intent = new Intent(this, Spillet.class);
            String s = (String) kat2.getText();
            intent.putExtra("Kategori", s);
            startActivity(intent);
            //Her skal spillet startes med et tilfældigt billede i denne kategori

        } else if (v == kat3) {
            Intent intent = new Intent(this, Spillet.class);
            String s = (String) kat3.getText();
            intent.putExtra("Kategori", s);
            startActivity(intent);
            //Her skal spillet startes med et tilfældigt billede i denne kategori

        } else if (v == kat4) {
            Intent intent = new Intent(this, Spillet.class);
            String s = (String) kat4.getText();
            intent.putExtra("Kategori", s);
            startActivity(intent);
            //Her skal spillet startes med et tilfældigt billede i denne kategori
        } else if (v == venner) {
            Intent intent = new Intent(this, Spillet.class);
            String s = (String) venner.getText();
            intent.putExtra("Kategori", s);
            startActivity(intent);
            //Her skal spillet startes med et tilfældigt billede af venners uploads
        } else if (v == nyKat) {
            //Opdater kategorierne

        }

    }
}
