package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RenkActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renk);

        setButtonAll();
    }

    @Override
    public void onClick(View view) {

    }

    private void setButtonAll() {
        ((Button)findViewById(R.id.kirmizi)).setOnClickListener(this);
        ((Button)findViewById(R.id.yesil)).setOnClickListener(this);
        ((Button)findViewById(R.id.mavi)).setOnClickListener(this);
        ((Button)findViewById(R.id.gri)).setOnClickListener(this);
        ((Button)findViewById(R.id.koyuMavi)).setOnClickListener(this);
        ((Button)findViewById(R.id.turuncu)).setOnClickListener(this);
        ((Button)findViewById(R.id.kahverengi)).setOnClickListener(this);
        ((Button)findViewById(R.id.beyaz)).setOnClickListener(this);
        ((Button)findViewById(R.id.pembe)).setOnClickListener(this);
        ((Button)findViewById(R.id.mor)).setOnClickListener(this);
        ((Button)findViewById(R.id.sari)).setOnClickListener(this);
        ((Button)findViewById(R.id.siyah)).setOnClickListener(this);

    }

}
