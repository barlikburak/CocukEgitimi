package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AracActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private boolean control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arac);

        control = true;
        setLinearLayoutAll();
    }

    @Override
    public void onClick(View view) {
        if(control) {
            control = false;
            if(mediaPlayer != null) {
                mediaPlayer.release();
            }
            switch (view.getId()) {
                case R.id.ambulans:
                    mediaPlayer = MediaPlayer.create(this,R.raw.ambulans);
                    break;
                case R.id.araba:
                    mediaPlayer = MediaPlayer.create(this,R.raw.araba);
                    break;
                case R.id.bisiklet:
                    mediaPlayer = MediaPlayer.create(this,R.raw.bisiklet);
                    break;
                case R.id.copKamyonu:
                    mediaPlayer = MediaPlayer.create(this,R.raw.copkamyonu);
                    break;
                case R.id.gemi:
                    mediaPlayer = MediaPlayer.create(this,R.raw.gemi);
                    break;
                case R.id.helikopter:
                    mediaPlayer = MediaPlayer.create(this,R.raw.helikopter);
                    break;
                case R.id.kamyon:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kamyon);
                    break;
                case R.id.motosiklet:
                    mediaPlayer = MediaPlayer.create(this,R.raw.motosiklet);
                    break;
                case R.id.otobus:
                    mediaPlayer = MediaPlayer.create(this,R.raw.otobus);
                    break;
                case R.id.taksi:
                    mediaPlayer = MediaPlayer.create(this,R.raw.taksi);
                    break;
                case R.id.tren:
                    mediaPlayer = MediaPlayer.create(this,R.raw.tren);
                    break;
                case R.id.ucak:
                    mediaPlayer = MediaPlayer.create(this,R.raw.ucak);
                    break;
                case R.id.tramvay:
                    mediaPlayer = MediaPlayer.create(this,R.raw.tramvay);
                    break;
                case R.id.uzayMekigi:
                    mediaPlayer = MediaPlayer.create(this,R.raw.uzaymakigi);
                    break;
                case R.id.vinc:
                    mediaPlayer = MediaPlayer.create(this,R.raw.vinc);
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

    private void setLinearLayoutAll() {
        ((LinearLayout)findViewById(R.id.ambulans)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.araba)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.bisiklet)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.copKamyonu)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.gemi)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.helikopter)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kamyon)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.motosiklet)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.otobus)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.taksi)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.tren)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.ucak)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.tramvay)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.uzayMekigi)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.vinc)).setOnClickListener(this);

    }
}