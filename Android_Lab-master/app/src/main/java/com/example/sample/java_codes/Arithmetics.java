package com.example.sample.java_codes;

import com.example.sample.R;
import com.example.sample.code;
import com.example.sample.quizz.JAVACODE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Arithmetics extends AppCompatActivity {
    String jcode= JAVACODE.ArithJCode;
    String xcode=JAVACODE.ArithXCode;
    int num1;
    int num2;
    int ans;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmatics);



    }

    public void operation(View v) {

        EditText n1 = (EditText) findViewById(R.id.arith_num1);
        num1 = Integer.valueOf(n1.getText().toString().equals("")? "0": n1.getText().toString() );
        EditText n2 = findViewById(R.id.arith_num2);
        num2 = Integer.valueOf(n2.getText().toString().equals("")? "0": n2.getText().toString() );
        answer = findViewById(R.id.arith_ans);
        String operation = String.valueOf(v.getTag());
        System.out.println(operation);

        switch (operation) {
            case "add":
                try {
                    ans = num1 + num2;
                    answer.setText(String.valueOf(ans));
                } catch (Exception e) {
                    answer.setText("Invalid Numbers");
                }
                break;
            case "sub":
                try {
                    ans = num1 - num2;
                    answer.setText(String.valueOf(ans));
                } catch (Exception e) {
                    answer.setText("Invalid Numbers");
                }
                break;
            case "mul":
                try {
                    ans = num1 * num2;
                    answer.setText(String.valueOf(ans));
                } catch (Exception e) {
                    answer.setText("Invalid Numbers");
                }
                break;
            case "div":
                try {
                    ans = num1 / num2;
                    answer.setText(String.valueOf(ans));
                } catch (ArithmeticException e) {
                    answer.setText("Invalid Numbers");
                }
                break;

        }
    }
    public void getcode(View v){
        String tag= v.getTag().toString();
        switch (tag){
            case "java":
                Intent i1= new Intent(Arithmetics.this, code.class);
                i1.putExtra("code",jcode);
                startActivity(i1);
                break;
            case "xml":
                Intent i2= new Intent(Arithmetics.this, code.class);
                i2.putExtra("code",xcode);
                startActivity(i2);
                break;
        }
    }
}