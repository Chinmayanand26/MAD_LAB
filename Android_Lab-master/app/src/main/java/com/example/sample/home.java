package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sample.quizz.Quiz;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class home extends AppCompatActivity {
    FirebaseAuth auth;
    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = auth.getCurrentUser();
        if(currentUser == null){

            Intent intent1
                    = new Intent(home.this,
                    login.class);
            startActivity(intent1);
            this.finish();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView username= findViewById(R.id.user);
        Button profile=findViewById(R.id.profile);
         auth=FirebaseAuth.getInstance();
        username.setText(auth.getCurrentUser().getEmail());
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.signOut();
                Intent intent1
                        = new Intent(home.this,
                        login.class);
                startActivity(intent1);
                Toast.makeText(getApplicationContext(),
                                "Logout sucessfully",
                                Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
    public void next(View view){
        Intent i= new Intent(home.this,MainActivity.class);
        startActivity(i);
    }
    public void quiz(View view){
        Intent i2= new Intent(home.this, Quiz.class);
        startActivity(i2);
    }
}