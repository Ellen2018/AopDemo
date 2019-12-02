package com.ellen.aopdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ellen.aopdemo.aop.TestAnnoTrace;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test(v);
            }
        });
    }

    @TestAnnoTrace(value = "dsad", type = 3 )
    public void test(View view) {
        System.out.println("Hello, I am CSDN_LQR");
    }
}
