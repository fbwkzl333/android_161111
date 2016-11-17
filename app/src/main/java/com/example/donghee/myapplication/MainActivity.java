package com.example.donghee.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    RatingBar r1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button3);
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Hello This is my first application !\nThanck you very much!", Toast.LENGTH_SHORT).show();
            }
        });
         b2 = (Button)findViewById(R.id.button4);

        r1 = (RatingBar) findViewById(R.id.ratingBar);
        r1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(), (int)rating+"점 선택 해주셨습니다 ! ", Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void onClick01(View v) {
        CheckBox ch1 = (CheckBox)findViewById(R.id.checkBox);
        if(ch1.isChecked()) {
            Toast.makeText(getApplicationContext(), "체크 했습니다", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(getApplicationContext(), "체크 해제 했습니다", Toast.LENGTH_SHORT).show();
    }

    public void onClick02(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }



    }


