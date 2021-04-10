package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MevsimActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mevsim);

        setImageViewAll();
    }

    @Override
    public void onClick(View view) {

    }

    private void setImageViewAll() {
        ((ImageView)findViewById(R.id.sonbahar)).setOnClickListener(this);
        ((ImageView)findViewById(R.id.kis)).setOnClickListener(this);
        ((ImageView)findViewById(R.id.ilkbahar)).setOnClickListener(this);
        ((ImageView)findViewById(R.id.yaz)).setOnClickListener(this);
    }
}