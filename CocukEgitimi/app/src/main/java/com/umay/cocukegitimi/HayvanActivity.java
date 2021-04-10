package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HayvanActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvan);

        setLinearLayoutAll();
    }

    @Override
    public void onClick(View view) {

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