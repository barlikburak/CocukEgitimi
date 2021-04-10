package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AracActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arac);

        setLinearLayoutAll();
    }

    @Override
    public void onClick(View view) {

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