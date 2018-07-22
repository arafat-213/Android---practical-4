package com.example.arafat_213.practical4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, et3, et4, et5;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.NameEditText);

    }

    public void submit(View view) {
        name = et1.getText().toString();
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
