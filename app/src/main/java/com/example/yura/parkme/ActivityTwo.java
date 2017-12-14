package com.example.yura.parkme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    Button code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        code = (Button) findViewById(R.id.code);
        code.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.code) {
            Intent intent = new Intent(this, SlideMenu.class);
            startActivity(intent);

        } else {
        }
    }
}

