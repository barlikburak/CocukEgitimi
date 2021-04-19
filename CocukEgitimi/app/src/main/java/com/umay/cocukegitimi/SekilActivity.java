package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SekilActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private boolean control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekil);

        control = true;
        setLinearLayoutAll();
    }

    @Override
    public void onClick(View view) {
        if(control) {
            control = false;
            if(mediaPlayer!=null) {
                mediaPlayer.release();
            }
            switch (view.getId()) {
                case R.id.yildiz:
                    mediaPlayer = MediaPlayer.create(this,R.raw.yildiz);
                    break;
                case R.id.ucgen:
                    mediaPlayer = MediaPlayer.create(this,R.raw.ucgen);
                    break;
                case R.id.kalp:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kalp);
                    break;
                case R.id.daire:
                    mediaPlayer = MediaPlayer.create(this,R.raw.daire);
                    break;
                case R.id.kare:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kare);
                    break;
                case R.id.eskenardortgen:
                    mediaPlayer = MediaPlayer.create(this,R.raw.eskenardortgen);
                    break;
                case R.id.dikdortgen:
                    mediaPlayer = MediaPlayer.create(this,R.raw.dikdortgen);
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
        ((LinearLayout)findViewById(R.id.yildiz)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.ucgen)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kalp)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.daire)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kare)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.eskenardortgen)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.dikdortgen)).setOnClickListener(this);
    }


}