package com.example.a5alumno.helloword;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(MainActivity.TAG, "onCreate()");

        Intent myIntent= new Intent(this, SEcondActivity.class);
        //startActivity(myIntent);
        startActivityForResult(myIntent,0);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
    super.onActivityResult(requestCode,resultCode,data);
}
}
