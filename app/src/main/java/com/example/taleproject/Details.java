package com.example.taleproject;

import static com.example.taleproject.R.id.storyContent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    TextView storyContent;
    Button button;

//    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        storyContent = findViewById(R.id.contentOfStory);
        Intent i = getIntent();
        String title = i.getStringExtra("titleOfStory");
        String content = i.getStringExtra("contentOfStory");

        //Set the appbar title as Story Title
        getSupportActionBar().setTitle(title);

        //Set content of the story to TextView
        storyContent.setText(content);
        button = (Button) findViewById(R.id.btnReturn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    private void openActivity2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}