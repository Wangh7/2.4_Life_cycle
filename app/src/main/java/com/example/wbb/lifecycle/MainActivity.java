package com.example.wbb.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.main_layout);
        if(savedInstanceState!=null){
            String tempData = savedInstanceState.getString("data_key");
            Log.e(TAG, tempData);
        }
        Button bt_normal = (Button) findViewById(R.id.start_normal_activity);
        Button bt_dialog = (Button) findViewById(R.id.start_dialog_activity);
        bt_normal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });
        bt_dialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e(TAG,"onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.e(TAG,"onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.e(TAG,"onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.e(TAG,"onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG,"onDestroy");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e(TAG,"onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        String tempData = "testtest";
        outState.putString("data_key",tempData);
    }
}
