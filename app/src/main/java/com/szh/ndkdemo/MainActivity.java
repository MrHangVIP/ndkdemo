package com.szh.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    static {
        System.loadLibrary("NDKLibary");
    }

    private static native int addTest(int a,int b);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int sum=addTest(5,10);
        Log.e("ndk_demo",sum+"");
    }
}
