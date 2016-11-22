package com.example.a5alumno.helloword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by A5Alumno on 21/11/2016.
 */

public class SEcondActivity extends Activity {

    private static final String TAG=SEcondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent resulIntent=new Intent();
        resulIntent.putExtra("returnValue", "string value");

       setResult(Activity.RESULT_OK, resulIntent);
        finish();
    }
    protected void onStart(){
        super.onStart();
        Log.e(SEcondActivity.TAG, "onStart");

        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show();
    }

    protected void onResume(){
        super.onResume();
        Log.e(SEcondActivity.TAG, "onResume");
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show();
    }
    protected void onPause(){
        Log.e(SEcondActivity.TAG, "onPause");
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }
    protected void onStop(){
        super.onStop();
        Log.e(SEcondActivity.TAG, "onStop");
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show();
    }



}
