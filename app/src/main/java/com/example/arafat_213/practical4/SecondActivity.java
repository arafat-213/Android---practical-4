package com.example.arafat_213.practical4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        Toast.makeText(getApplicationContext(), "Name : " + intent.getStringExtra("name"), Toast.LENGTH_LONG).show();
    }
}
