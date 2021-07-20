package com.studentlearning.studentjunction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Manual extends AppCompatActivity {
    private Button btnNext;
    private Button btnBack;
    private TextView textView;
    private int slide = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        btnNext = (Button) findViewById(R.id.next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slide++;
                if (slide < 6) {
                    gotomanual(slide);
                } else {
                    slide = 0;
                    goToDashboard();
                }
            }
        });

        btnBack = (Button) findViewById(R.id.back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slide--;
                if (slide < 0) {
                    slide = 0;
                    goToDashboard();
                } else {
                    gotomanual(slide);
                }
            }
        });
        textView = (TextView) findViewById(R.id.manualText);
    }

    private void gotomanual(int i) {
        switch (i) {
            case 0:
                textView.setText(R.string.manualtext);
                textView.setBackgroundColor(getResources().getColor(R.color.teal_700));
                btnBack.setBackgroundColor(getResources().getColor(R.color.gray));
                btnNext.setBackgroundColor(getResources().getColor(R.color.gray));
                break;
            case 1:
                textView.setText(R.string.manual2text);
                textView.setBackgroundColor(getResources().getColor(R.color.gray));
                btnBack.setBackgroundColor(getResources().getColor(R.color.teal_700));
                btnNext.setBackgroundColor(getResources().getColor(R.color.teal_700));
                break;
            case 2:
                textView.setText(R.string.manual3text);
                textView.setBackgroundColor(getResources().getColor(R.color.teal_700));
                btnBack.setBackgroundColor(getResources().getColor(R.color.gray));
                btnNext.setBackgroundColor(getResources().getColor(R.color.gray));
                break;
            case 3:
                textView.setText(R.string.manual4text);
                textView.setBackgroundColor(getResources().getColor(R.color.gray));
                btnBack.setBackgroundColor(getResources().getColor(R.color.teal_700));
                btnNext.setBackgroundColor(getResources().getColor(R.color.teal_700));
                break;
            case 4:
                textView.setText(R.string.manual5text);
                textView.setBackgroundColor(getResources().getColor(R.color.teal_700));
                btnBack.setBackgroundColor(getResources().getColor(R.color.gray));
                btnNext.setBackgroundColor(getResources().getColor(R.color.gray));
                break;
            case 5:
                textView.setText(R.string.manual6text);
                textView.setBackgroundColor(getResources().getColor(R.color.gray));
                btnBack.setBackgroundColor(getResources().getColor(R.color.teal_700));
                btnNext.setBackgroundColor(getResources().getColor(R.color.teal_700));
                break;
        }
    }

    public void goToDashboard() {
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}