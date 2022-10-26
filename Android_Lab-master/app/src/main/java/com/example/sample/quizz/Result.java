package com.example.sample.quizz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sample.R;
import com.example.sample.home;


import static com.example.sample.quizz.Quiz.result;
import static com.example.sample.quizz.Quiz.score;
public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        TextView scoreTxtView = (TextView) findViewById(R.id.score);
        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBar1);


        SharedPreferences sharedPreferences = getSharedPreferences("Result", Context.MODE_PRIVATE);
        int score1 = sharedPreferences.getInt(result, score);

//
//        Bundle b = getIntent().getExtras();
//        int score = b.getInt("score");
        ratingBar.setRating(score);
        scoreTxtView.setText(String.valueOf(score));

//        if(score1 == 0){
//            img.setImageResource(R.drawable.score_0);
//        }else if(score1 == 1){
//            img.setImageResource(R.drawable.score_1);
//        }else if(score1 == 2){
//            img.setImageResource(R.drawable.score_2);
//        }else if(score1 == 3){
//            img.setImageResource(R.drawable.score_3);
//        }else if(score1 == 4){
//            img.setImageResource(R.drawable.score_4);
//        }else if(score1 == 5){
//            img.setImageResource(R.drawable.score_5);
//        }
    }


    public void Back(View view) {
        super.onBackPressed();
score=0;
        Intent intent = new Intent(Result.this, home.class);
        startActivity(intent);
        finish();
    }
}