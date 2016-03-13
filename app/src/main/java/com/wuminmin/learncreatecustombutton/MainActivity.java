package com.wuminmin.learncreatecustombutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyButton myButton2 = (MyButton) findViewById(R.id.myButton2);
        myButton2.setEnabled(false);
    }
}
