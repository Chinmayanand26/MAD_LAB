package com.example.sample.java_codes;
import com.example.sample.R;
import com.google.firebase.auth.FirebaseUser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Login extends AppCompatActivity {
int i;
    RadioGroup radioGroup;
TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         radioGroup= findViewById(R.id.radioGroup);
        System.out.println(i);
        Button bt= findViewById(R.id.button2);
        ans= findViewById(R.id.textView6);

    }
    public void click(View v){
        System.out.println(radioGroup.getCheckedRadioButtonId());
        if(radioGroup.getCheckedRadioButtonId()==-1){
            ans.setTextColor(0xFFFF0000);
           ans.setText("Please select an option");
        }else if((int)radioGroup.getCheckedRadioButtonId()==2131296806){
            ans.setTextColor(0xFF00FF00);
            ans.setText("Right answer");
        }else{
            ans.setTextColor(0xFF000000);
            ans.setText("Wrong answer ");
        }
    }
}