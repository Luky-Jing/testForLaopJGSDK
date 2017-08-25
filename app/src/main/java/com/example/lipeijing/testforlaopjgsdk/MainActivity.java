package com.example.lipeijing.testforlaopjgsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        setContentView(R.layout.activity_main);
    }
}
