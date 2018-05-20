package com.example.kingbradley.exercise8;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Fragment;
import android.widget.Button;

import layout.FragmentOne;
import layout.FragmentThree;
import layout.FragmentTwo;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void selectFrag(View view) {
        Fragment fr;

        if (view == findViewById(R.id.button2)) {

            fr = new FragmentTwo();

        } else if (view == findViewById(R.id.button1)) {

            fr = new FragmentOne();

        } else if (view == findViewById(R.id.button)){
            fr = new com.example.kingbradley.exercise8.FinalFragment();

        }

        else {
            Button FinalButton;
            FinalButton = (Button) findViewById(R.id.FinalButton);

            fr = new FragmentThree();
        }


        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();
    }

}