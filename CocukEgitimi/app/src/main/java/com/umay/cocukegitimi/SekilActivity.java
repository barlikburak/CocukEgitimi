package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SekilActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekil);

        setLinearLayoutAll();
    }

    @Override
    public void onClick(View view) {

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