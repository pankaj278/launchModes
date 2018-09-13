package com.example.launchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    private static final String TAG = "AActivityB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.d(TAG,"onCreate");
        findViewById(R.id.bBTN).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityB.this,ActivityC.class);
                intent.putExtra("DATA","VALUE");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
}