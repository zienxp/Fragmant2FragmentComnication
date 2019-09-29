package com.example.fragmant2fragmentcomnication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MessageFragment.OnMessageSendListener {

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

    @Override
    public void onMessageSend(String message) {

        DisplayFragment displayFragment = new DisplayFragment();
        Bundle bundle = new Bundle();
        bundle.putString("message",message);
        displayFragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Contaniner,displayFragment,null).addToBackStack(null).commit();


    }
}
