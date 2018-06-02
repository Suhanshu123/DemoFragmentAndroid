package com.example.suhanshu.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.fl_one,FragmentOne.newInstance("FragmentOne")).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fl_two,FragmentOne.newInstance("FragmentTwo")).commit();


    }
}
