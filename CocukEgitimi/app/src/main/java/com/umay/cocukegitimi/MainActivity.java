package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLinearLayoutAll();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.alfabeLineerLayout:
                intent = new Intent(this,AlfabeActivity.class);
                startActivity(intent);
                break;
            case R.id.aracLineerLayout:
                intent = new Intent(this,AracActivity.class);
                startActivity(intent);
                break;
            case R.id.hayvanLineerLayout:
                intent = new Intent(this,HayvanActivity.class);
                startActivity(intent);
                break;
            case R.id.meslekLineerLayout:
                intent = new Intent(this,MeslekActivity.class);
                startActivity(intent);
                break;
            case R.id.mevsimLineerLayout:
                intent = new Intent(this,MevsimActivity.class);
                startActivity(intent);
                break;
            case R.id.meyveSebzeLineerLayout:
                intent = new Intent(this,MeyvesebzeActivity.class);
                startActivity(intent);
                break;
            case R.id.renkLineerLayout:
                intent = new Intent(this,RenkActivity.class);
                startActivity(intent);
                break;
            case R.id.sayiLineerLayout:
                intent = new Intent(this,SayiActivity.class);
                startActivity(intent);
                break;
            case R.id.sekilLineerLayout:
                intent = new Intent(this,SekilActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void setLinearLayoutAll() {
        ((LinearLayout)findViewById(R.id.alfabeLineerLayout)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.aracLineerLayout)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.hayvanLineerLayout)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.meslekLineerLayout)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.mevsimLineerLayout)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.meyveSebzeLineerLayout)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.renkLineerLayout)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.sayiLineerLayout)).setOnClickListener(this);
        ((LinearLayout)findViewById(R.id.sekilLineerLayout)).setOnClickListener(this);
    }
}
