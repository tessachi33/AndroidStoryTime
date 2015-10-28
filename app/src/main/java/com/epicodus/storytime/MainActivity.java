package com.epicodus.storytime;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends Activity {

    private EditText mNameF;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText) findViewById(R.id.name);
        mStartButton = (Button) findViewById(R.id.startButton);
    }
}