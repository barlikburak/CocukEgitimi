package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MeslekActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meslek);

        setLinearLayoutAll();
    }

    @Override
    public void onClick(View view) {

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