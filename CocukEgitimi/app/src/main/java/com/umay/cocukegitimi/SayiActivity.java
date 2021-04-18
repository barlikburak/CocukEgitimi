package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SayiActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayi);

        setButtonAll();
    }

    @Override
    public void onClick(View view) {

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