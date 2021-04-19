package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SayiActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private boolean control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayi);

        control = true;
        setButtonAll();
    }

    @Override
    public void onClick(View view) {
        if(control) {
            control = false;
            if(mediaPlayer!=null){
                mediaPlayer.release();
            }
            switch (view.getId()) {
                case R.id.sifir:
                    mediaPlayer = MediaPlayer.create(this,R.raw.sifir);
                    break;
                case R.id.bir:
                    mediaPlayer = MediaPlayer.create(this,R.raw.bir);
                    break;
                case R.id.iki:
                    mediaPlayer = MediaPlayer.create(this,R.raw.iki);
                    break;
                case R.id.uc:
                    mediaPlayer = MediaPlayer.create(this,R.raw.uc);
                    break;
                case R.id.dort:
                    mediaPlayer = MediaPlayer.create(this,R.raw.dort);
                    break;
                case R.id.bes:
                    mediaPlayer = MediaPlayer.create(this,R.raw.bes);
                    break;
                case R.id.alti:
                    mediaPlayer = MediaPlayer.create(this,R.raw.alti);
                    break;
                case R.id.yedi:
                    mediaPlayer = MediaPlayer.create(this,R.raw.yedi);
                    break;
                case R.id.sekiz:
                    mediaPlayer = MediaPlayer.create(this,R.raw.sekiz);
                    break;
                case R.id.dokuz:
                    mediaPlayer = MediaPlayer.create(this,R.raw.dokuz);
                    break;
                case R.id.on:
                    mediaPlayer = MediaPlayer.create(this,R.raw.on);
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

    public void setButtonAll(){
        ((Button)findViewById(R.id.sifir)).setOnClickListener(this);
        ((Button)findViewById(R.id.bir)).setOnClickListener(this);
        ((Button)findViewById(R.id.iki)).setOnClickListener(this);
        ((Button)findViewById(R.id.uc)).setOnClickListener(this);
        ((Button)findViewById(R.id.dort)).setOnClickListener(this);
        ((Button)findViewById(R.id.bes)).setOnClickListener(this);
        ((Button)findViewById(R.id.alti)).setOnClickListener(this);
        ((Button)findViewById(R.id.yedi)).setOnClickListener(this);
        ((Button)findViewById(R.id.sekiz)).setOnClickListener(this);
        ((Button)findViewById(R.id.dokuz)).setOnClickListener(this);
        ((Button)findViewById(R.id.on)).setOnClickListener(this);
    }

}