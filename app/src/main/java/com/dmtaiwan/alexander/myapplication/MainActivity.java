package com.dmtaiwan.alexander.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String FRAGMENT_TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, MyFragment.newInstance("for the first time"), FRAGMENT_TAG).commit();
        }else{
            MyFragment myFragment = (MyFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_TAG);
            myFragment.setMessage("after being found by the Fragment Manager");
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, myFragment, FRAGMENT_TAG).commit();
        }
    }
}
