package com.example.inehemias.sendbroadcast2;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    protected static final String I_AM_HOME = "com.example.I_AM_HOME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendCustomBroadcast(View view){
        Intent intent = new Intent();
        intent.setAction(I_AM_HOME);
        intent.putExtra("pos",new Random().nextInt(5));
        sendBroadcast(intent);

    }
}