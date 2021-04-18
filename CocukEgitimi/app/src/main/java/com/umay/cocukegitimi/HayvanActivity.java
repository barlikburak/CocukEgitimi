package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HayvanActivity extends AppCompatActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private boolean control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvan);

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
                case R.id.karinca:
                    mediaPlayer = MediaPlayer.create(this,R.raw.karinca);
                    break;
                case R.id.kelebek:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kelebek);
                    break;
                case R.id.kedi:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kedi);
                    break;
                case R.id.horoz:
                    mediaPlayer = MediaPlayer.create(this,R.raw.horoz);
                    break;
                case R.id.kopek:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kopek);
                    break;
                case R.id.ordek:
                    mediaPlayer = MediaPlayer.create(this,R.raw.ordek);
                    break;
                case R.id.fil:
                    mediaPlayer = MediaPlayer.create(this,R.raw.fil);
                    break;
                case R.id.balik:
                    mediaPlayer = MediaPlayer.create(this,R.raw.balik);
                    break;
                case R.id.kurbaga:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kurbaga);
                    break;
                case R.id.zurafa:
                    mediaPlayer = MediaPlayer.create(this,R.raw.zurafa);
                    break;
                case R.id.kirpi:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kirpi);
                    break;
                case R.id.at:
                    mediaPlayer = MediaPlayer.create(this,R.raw.at);
                    break;
                case R.id.kanguru:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kanguru);
                    break;
                case R.id.aslan:
                    mediaPlayer = MediaPlayer.create(this,R.raw.aslan);
                    break;
                case R.id.maymun:
                    mediaPlayer = MediaPlayer.create(this,R.raw.maymun);
                    break;
                case R.id.panda:
                    mediaPlayer = MediaPlayer.create(this,R.raw.panda);
                    break;
                case R.id.penguen:
                    mediaPlayer = MediaPlayer.create(this,R.raw.penguen);
                    break;
                case R.id.tavsan:
                    mediaPlayer = MediaPlayer.create(this,R.raw.tavsan);
                    break;
                case R.id.kaplan:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kaplan);
                    break;
                case R.id.kablumbaga:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kaplumbaga);
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
        ((LinearLayout)findViewById(R.id.karinca)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kelebek)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kedi)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.horoz)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kopek)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.ordek)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.fil)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.balik)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kurbaga)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.zurafa)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kirpi)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.at)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kanguru)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.aslan)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.maymun)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.panda)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.penguen)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.tavsan)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kaplan)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kablumbaga)).setOnClickListener(this);
    }
}