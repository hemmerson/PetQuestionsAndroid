package com.example.petquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonNextSpider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNextSpider = findViewById(R.id.buttonNextSpider);

        buttonNextSpider.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SpiderActivity.class);
            startActivity(intent);
        });
    }
}