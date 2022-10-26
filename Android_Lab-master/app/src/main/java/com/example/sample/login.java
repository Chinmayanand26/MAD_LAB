package com.example.sample;
import android.os.Bundle;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.regex.Pattern;

public class login extends AppCompatActivity {
EditText Email,Password;
Button login,signup;
ProgressBar pg;
FirebaseAuth auth;
    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = auth.getCurrentUser();
        if(currentUser != null){

            Intent intent1
                    = new Intent(login.this,
                    home.class);
            startActivity(intent1);
            this.finish();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        getSupportActionBar().hide();
        auth=  FirebaseAuth.getInstance();
        Email=findViewById(R.id.email);
        Password=findViewById(R.id.pass);
        signup=findViewById(R.id.signup);
        login=findViewById(R.id.login);
        pg=findViewById(R.id.progressbar);


    }



    public void signUp(View view)
    {

        pg.setVisibility(View.VISIBLE);

        String email, password;
        email = Email.getText().toString();
        password = Password.getText().toString();

        // Validations for input email and password
        if (TextUtils.isEmpty(email) && isValid(email)) {
            Toast.makeText(getApplicationContext(),
                            "Please enter valid email!!",
                            Toast.LENGTH_LONG)
                    .show();
            return;
        }
       else if (TextUtils.isEmpty(password) && password.length()>5) {
            Toast.makeText(getApplicationContext(),
                            "Please enter valid password!!",
                            Toast.LENGTH_LONG)
                    .show();
            return;
        }
else {
            // create new user or register new user
            try {
                auth
                        .createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(),
                                                    "Registration successful!",
                                                    Toast.LENGTH_LONG)
                                            .show();

                                    // hide the progress bar
                                    pg.setVisibility(View.GONE);

                                    // if the user created intent to login activity
                                    Intent intent
                                            = new Intent(login.this,
                                            home.class);
                                    startActivity(intent);
                                } else {
                                    System.out.println(task.getException());
                                    // Registration failed
                                    Toast.makeText(
                                                    getApplicationContext(),
                                                    "Registration failed!!"
                                                            + " Please try again later",
                                                    Toast.LENGTH_LONG)
                                            .show();

                                    // hide the progress bar
                                    pg.setVisibility(View.GONE);
                                }
                            }
                        });
            }
            catch(Exception e){
                Toast.makeText(getApplicationContext(),
                                "Oops! Something Went Wrong",
                                Toast.LENGTH_LONG)
                        .show();
                pg.setVisibility(View.GONE);
            }
        }
    }

    public void signIn(View view)
    {

        // show the visibility of progress bar to show loading
        pg.setVisibility(View.VISIBLE);
        String email, password;
        email = Email.getText().toString();
        password = Password.getText().toString();

        // validations for input email and password
        if (TextUtils.isEmpty(email) && isValid(email)) {
            System.out.println("here");
            Toast.makeText(getApplicationContext(),
                            "Please enter valid email!!",
                            Toast.LENGTH_LONG)
                    .show();
            return;
        }

        else if (TextUtils.isEmpty(password) && password.length()>5) {
            Toast.makeText(getApplicationContext(),
                            "Please enter valid password!!",
                            Toast.LENGTH_LONG)
                    .show();
            return;
        }

        // signin existing user
        else {
            try {


                auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(
                                new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(
                                            @NonNull Task<AuthResult> task) {
                                        if (task.isSuccessful()) {
                                            Toast.makeText(getApplicationContext(),
                                                            "Login successful!!",
                                                            Toast.LENGTH_LONG)
                                                    .show();

                                            // hide the progress bar
                                            pg.setVisibility(View.GONE);

                                            // if sign-in is successful
                                            // intent to home activity
                                            Intent intent
                                                    = new Intent(login.this,
                                                    home.class);
                                            startActivity(intent);
                                        } else {

                                            // sign-in failed
                                            Toast.makeText(getApplicationContext(),
                                                            "Login failed!!",
                                                            Toast.LENGTH_LONG)
                                                    .show();

                                            // hide the progress bar
                                            pg.setVisibility(View.GONE);
                                        }
                                    }
                                });
            }
            catch (Exception e){
                Toast.makeText(getApplicationContext(),
                                "Oops! Something Went Wrong",
                                Toast.LENGTH_LONG)
                        .show();
                pg.setVisibility(View.GONE);
            }
        }
    }

    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}