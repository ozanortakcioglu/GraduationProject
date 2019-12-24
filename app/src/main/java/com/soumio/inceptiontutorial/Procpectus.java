package com.soumio.inceptiontutorial;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Procpectus extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procpectus);
        iv=findViewById(R.id.imageView3);
        String chosen = (String) getIntent().getStringExtra("name");
        if(chosen.equals("dolorex")) {
            iv.setImageResource(R.drawable.dolorex);
        }
        if(chosen.equals("aferin")) {
            iv.setImageResource(R.drawable.aferin);
        }
        if(chosen.equals("parol")) {
            iv.setImageResource(R.drawable.parol);
        }
        if(chosen.equals("nurofen")) {
            iv.setImageResource(R.drawable.nurofen);
        }
        if(chosen.equals("majezik")) {
            iv.setImageResource(R.drawable.majezik);
        }
        Toast.makeText(this, chosen, Toast.LENGTH_SHORT).show();

    }

}
