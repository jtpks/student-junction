package com.studentlearning.studentjunction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {
    private ImageButton calendar;
    private ImageButton todoButton;
    private ImageButton notes;
    private ImageButton quotes;
    private Button manual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        todoButton = (ImageButton) findViewById(R.id.imageView3);
        todoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        calendar = (ImageButton) findViewById(R.id.calendar);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

        quotes = (ImageButton) findViewById(R.id.quotes);
        quotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });

        notes = (ImageButton) findViewById(R.id.notes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        manual = (Button) findViewById(R.id.manual);
        manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity0();
            }
        });

    }

    public void openActivity0() {
        Intent intent = new Intent(this, Manual.class);
        startActivity(intent);
    }

    public void openActivity1() {
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }

    public void openActivity2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openActivity6() {
        Intent intent = new Intent(this, Quotes.class);
        startActivity(intent);
    }

    public void openActivity4() {
        Intent intent = new Intent(this, Notepad.class);
        startActivity(intent);
    }
}


