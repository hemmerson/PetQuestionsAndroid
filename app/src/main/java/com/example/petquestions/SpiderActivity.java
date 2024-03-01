package com.example.petquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SpiderActivity extends AppCompatActivity {

    private Button buttonNextQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spider);

        buttonNextQuestion = findViewById(R.id.buttonNextQuestions);

        buttonNextQuestion.setOnClickListener(view -> {
            Intent intent = new Intent(SpiderActivity.this, QuestionsActivity.class);
            startActivity(intent);
        });
    }
}