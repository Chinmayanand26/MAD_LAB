package com.example.sample.java_codes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.sample.Code_Java;
import com.example.sample.MainActivity;
import com.example.sample.R;
import com.example.sample.second;
import com.example.sample.third;
import com.gauravk.bubblenavigation.BubbleNavigationLinearView;

public class Fragments extends AppCompatActivity {
BubbleNavigationLinearView actionBar;
String jcode="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrap1);
        getSupportActionBar().hide();
        actionBar= findViewById(R.id.bubblenavigationbar);
        FragmentManager fManager= getSupportFragmentManager();
        FragmentTransaction fTransaction=fManager.beginTransaction();
        fTransaction.replace(R.id.fragment_container,new Code_Java());
        fTransaction.commit();

        actionBar.setNavigationChangeListener((view, position) -> {
            switch (position){

                case 0:
                    FragmentManager manager1 =
                            getSupportFragmentManager();
                    FragmentTransaction transaction1 =
                            manager1.beginTransaction();
                    transaction1.replace(R.id.fragment_container,
                            new Code_Java());
                    transaction1.commit();
                    break;

                case 1:
                    manager1 = getSupportFragmentManager();
                    transaction1 = manager1.beginTransaction();
                    transaction1.replace(R.id.fragment_container,
                            new second());
                    transaction1.commit();
                    break;

                case 2:
                    manager1 = getSupportFragmentManager();
                    transaction1 = manager1.beginTransaction();
                    transaction1.replace(R.id.fragment_container,
                            new third());
                    transaction1.commit();
                    break;


            }
        });
    }



    public void onClick(View v){
        Intent i= new Intent(Fragments.this, MainActivity.class);
        startActivity(i);
    }
}