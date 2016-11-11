package com.example.donghee.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    CheckBox C1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button3);
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "안녕?", Toast.LENGTH_SHORT).show();
            }
        });

        b2 = (Button) findViewById(R.id.button4);
        b2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "이름은 무엇입니까?", Toast.LENGTH_SHORT).show();
            }
        });


        findViewById(R.id.checkBox).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Checked(v); // 체크되었을 때 동작코드
            }
        });
    }


    public String Checked(View v){
        C1 = (CheckBox)findViewById(R.id.checkBox);

        String resultText = "";
        if (C1.isChecked()){
            resultText = "체크했습니다";
        }
        return resultText;
    }


}

