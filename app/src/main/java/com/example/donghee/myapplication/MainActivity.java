package com.example.donghee.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    RatingBar r1;
    RadioButton o1, o2;
    LinearLayout layout;
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

        o1 = (RadioButton) findViewById(R.id.radioButton3);
        o2 = (RadioButton) findViewById(R.id.radioButton4);
        o1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"남자입니다",Toast.LENGTH_SHORT).show();
            }
        });
        o2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"여자입니다",Toast.LENGTH_SHORT).show();
            }
        });

        CalendarView cal = (CalendarView) findViewById(R.id.calendarView);
        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(MainActivity.this, "" +year+"/"+(month+1)+"/"+dayOfMonth, Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void onClick00(View v){
        TextView tv1 = (TextView) findViewById(R.id.textView);
        Toast.makeText(getApplicationContext(), "Hello World", Toast.LENGTH_SHORT).show();
    }

    public void onClick01(View v) {
        CheckBox ch1 = (CheckBox)findViewById(R.id.checkBox);
        layout = (LinearLayout) findViewById(R.id.activity_main);
        if(ch1.isChecked() == true){
            Toast.makeText(getApplicationContext(), "체크 했습니다", Toast.LENGTH_SHORT).show();
            layout.setBackgroundColor(Color.rgb(200,218,247));
        } else {
            Toast.makeText(getApplicationContext(), "체크 해제 했습니다", Toast.LENGTH_SHORT).show();
            layout.setBackgroundColor(Color.rgb(255,255,255));
        }

    }


    public void onClick02(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }



    }


