package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.LinearLayout;

public class MeyvesebzeActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private boolean control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meyvesebze);

        control = true;
        setLinearLayoutAll();
    }

    @Override
    public void onClick(View view) {
        if(control){
            control = false;
            if(mediaPlayer != null){
                mediaPlayer.release();
            }
            switch (view.getId()) {
                case R.id.kivi:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kivi);
                    break;
                case R.id.ananas:
                    mediaPlayer = MediaPlayer.create(this,R.raw.ananas);
                    break;
                case R.id.armut:
                    mediaPlayer = MediaPlayer.create(this,R.raw.armut);
                    break;
                case R.id.bezelye:
                    mediaPlayer = MediaPlayer.create(this,R.raw.bezelye);
                    break;
                case R.id.biber:
                    mediaPlayer = MediaPlayer.create(this,R.raw.biber);
                    break;
                case R.id.cilek:
                    mediaPlayer = MediaPlayer.create(this,R.raw.cilek);
                    break;
                case R.id.domates:
                    mediaPlayer = MediaPlayer.create(this,R.raw.domates);
                    break;
                case R.id.elma:
                    mediaPlayer = MediaPlayer.create(this,R.raw.elma);
                    break;
                case R.id.havuc:
                    mediaPlayer = MediaPlayer.create(this,R.raw.havuc);
                    break;
                case R.id.hindistanCevizi:
                    mediaPlayer = MediaPlayer.create(this,R.raw.hindistancevizi);
                    break;
                case R.id.kabak:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kabak);
                    break;
                case R.id.karpuz:
                    mediaPlayer = MediaPlayer.create(this,R.raw.karpuz);
                    break;
                case R.id.kavun:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kavun);
                    break;
                case R.id.marul:
                    mediaPlayer = MediaPlayer.create(this,R.raw.marul);
                    break;
                case R.id.portakal:
                    mediaPlayer = MediaPlayer.create(this,R.raw.portakal);
                    break;
                case R.id.uzum:
                    mediaPlayer = MediaPlayer.create(this,R.raw.uzum);
                    break;
                case R.id.kiraz:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kiraz);
                    break;
                case R.id.patlican:
                    mediaPlayer = MediaPlayer.create(this,R.raw.patlican);
                    break;
                case R.id.limon:
                    mediaPlayer = MediaPlayer.create(this,R.raw.limon);
                    break;
                case R.id.muz:
                    mediaPlayer = MediaPlayer.create(this,R.raw.muz);
                    break;
            }
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    control = true;
                }
            });
            mediaPlayer.start();
        }
    }

    public void setLinearLayoutAll(){
        ((LinearLayout)findViewById(R.id.ananas)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.armut)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.bezelye)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.biber)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.cilek)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.domates)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.elma)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.havuc)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.hindistanCevizi)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kabak)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.karpuz)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kavun)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.marul)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.portakal)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kivi)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.uzum)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kiraz)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.patlican)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.limon)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.muz)).setOnClickListener(this);
    }

}