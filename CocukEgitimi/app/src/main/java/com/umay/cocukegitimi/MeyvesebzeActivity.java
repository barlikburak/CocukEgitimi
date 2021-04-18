package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.LinearLayout;

public class MeyvesebzeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meyvesebze);

        setLinearLayoutAll();
    }

    @Override
    public void onClick(View view) {

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