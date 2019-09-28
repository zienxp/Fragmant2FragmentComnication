package com.example.fragmant2fragmentcomnication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.fragment_Contaniner)!=null){

            if (savedInstanceState!=null){
                return;
            }

            MessageFragment messageFragment = new MessageFragment();

            getSupportFragmentManager().beginTransaction().add(R.id.fragment_Contaniner,messageFragment,null).commit();

        }
    }
}
