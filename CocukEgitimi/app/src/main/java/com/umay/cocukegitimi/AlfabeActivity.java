package com.umay.cocukegitimi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlfabeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabe);

        setButtonAll();
    }

    @Override
    public void onClick(View view) {

    }

    public void setButtonAll(){
        ((Button)findViewById(R.id.harfA)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfB)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfC)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfÇ)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfD)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfE)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfF)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfG)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfĞ)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfH)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfI)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfİ)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfJ)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfK)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfL)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfM)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfN)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfO)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfÖ)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfP)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfR)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfS)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfŞ)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfT)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfU)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfÜ)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfV)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfY)).setOnClickListener(this);
        ((Button)findViewById(R.id.harfZ)).setOnClickListener(this);
    }
}