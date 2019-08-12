package com.example.ritwik.ritwikapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    public void sendMessage(View view) {
//        Log.d("MYCODE", "It works");
//    }

    public void sendMessage(View view){
        Log.d("MYTAG123: ","IT WORKS");
        Intent newIntent= new Intent(this, SendActivity.class);
        startActivity(newIntent);


    }
}



