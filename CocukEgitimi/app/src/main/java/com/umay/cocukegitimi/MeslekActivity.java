package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MeslekActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private boolean control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meslek);

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
                case R.id.asci:
                    mediaPlayer = MediaPlayer.create(this,R.raw.asci);
                    break;
                case R.id.asker:
                    mediaPlayer = MediaPlayer.create(this,R.raw.asker);
                    break;
                case R.id.bilimAdami:
                    mediaPlayer = MediaPlayer.create(this,R.raw.biliminsani);
                    break;
                case R.id.ciftci:
                    mediaPlayer = MediaPlayer.create(this,R.raw.ciftci);
                    break;
                case R.id.dedektif:
                    mediaPlayer = MediaPlayer.create(this,R.raw.dedektif);
                    break;
                case R.id.doktor:
                    mediaPlayer = MediaPlayer.create(this,R.raw.doktor);
                    break;
                case R.id.fotografci:
                    mediaPlayer = MediaPlayer.create(this,R.raw.fotografci);
                    break;
                case R.id.garson:
                    mediaPlayer = MediaPlayer.create(this,R.raw.garson);
                    break;
                case R.id.hemsire:
                    mediaPlayer = MediaPlayer.create(this,R.raw.hemsire);
                    break;
                case R.id.hostes:
                    mediaPlayer = MediaPlayer.create(this,R.raw.hostes);
                    break;
                case R.id.itfaiyeci:
                    mediaPlayer = MediaPlayer.create(this,R.raw.itfaiyeci);
                    break;
                case R.id.kuafor:
                    mediaPlayer = MediaPlayer.create(this,R.raw.kuafor);
                    break;
                case R.id.mimar:
                    mediaPlayer = MediaPlayer.create(this,R.raw.mimar);
                    break;
                case R.id.ogretmen:
                    mediaPlayer = MediaPlayer.create(this,R.raw.ogretmen);
                    break;
                case R.id.pilot:
                    mediaPlayer = MediaPlayer.create(this,R.raw.pilot);
                    break;
                case R.id.polis:
                    mediaPlayer = MediaPlayer.create(this,R.raw.polis);
                    break;
                case R.id.postaci:
                    mediaPlayer = MediaPlayer.create(this,R.raw.postaci);
                    break;
                case R.id.ressam:
                    mediaPlayer = MediaPlayer.create(this,R.raw.ressam);
                    break;
                case R.id.sarkici:
                    mediaPlayer = MediaPlayer.create(this,R.raw.sarkici);
                    break;
                case R.id.tamirci:
                    mediaPlayer = MediaPlayer.create(this,R.raw.tamirci);
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

    public void setLinearLayoutAll() {
        ((LinearLayout)findViewById(R.id.asci)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.asker)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.bilimAdami)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.ciftci)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.dedektif)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.doktor)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.fotografci)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.garson)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.hemsire)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.hostes)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.itfaiyeci)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.kuafor)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.mimar)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.ogretmen)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.pilot)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.polis)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.postaci)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.ressam)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.sarkici)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.tamirci)).setOnClickListener(this);
    }
}