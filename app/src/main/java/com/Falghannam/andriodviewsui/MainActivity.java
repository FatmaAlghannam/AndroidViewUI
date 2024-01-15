package com.Falghannam.andriodviewsui;

import android.view.View;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private static ArrayList<String> questions;
    private static ArrayList<Boolean> answers;
    private static int currentQuestionIndex = 0;
    private static Integer userScore = 0;
    TextView questionTextView, correctAnswerText, wrongAnswerText;
    Button trueButton, falseButton, nextQuestionButton;
    private FrameLayout correctAnswerCircle, wrongAnswerCircle;
    private View falseButtonButton;

    private void showFinalResults() {
    }

    private void setupQuestionAndAnswer() {
    }

    private void correctAnswer() {
    }

    //void showFinalResults(){}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initializeViews();
        private void setupQuestionAndAnswers();
        private void displayQuestion();
//its missing initiation of the button of true reference


        // set listener , lambda or the 2 other ways :
        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        nextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }

//this line will initialized the views only :


            private void initializeViews() {
                questionTextView = findViewById(R.id.textView);
                questionTextView = findViewById(R.id.textView);
                questionTextView = findViewById(R.id.textView);
                questionTextView = findViewById(R.id.textView);
                questionTextView = findViewById(R.id.textView);
                questionTextView = findViewById(R.id.textView);
            }

            {
                String currentQuestion = questions.get(currentQuestionIndex);
                questionTextView.setText(currentQuestion);
            }


            {
                questions.add("Android is an operating system");
                answers.add(false);
                questions.add("Kotlin is officially supported for Android development");
                answers.add(false);
                questions.add("Coded is the first academy in the middle east ");
                answers.add(true);

            }

            private void checkAnswer(boolean userOutput) {
                boolean correctAnswer = answers.get(currentQuestionIndex);
                //userOutput++; correct answer
                if (userOutput == correctAnswer) correctAnswer();

                else {
                    //wrong answer;
                    showwrongAnswer();
                }
            }

            private void showwrongAnswer() {
                nextQuestionButton.setVisibility(View.INVISIBLE);
                correctAnswerText.setVisibility(View.INVISIBLE);
                trueButton.setVisibility(View.VISIBLE);
                wrongAnswerText.setVisibility(View.VISIBLE);
                falseButton.setVisibility(View.VISIBLE);


            }

            //show correct answer only:
            private void showcorrectAnswer() {
                nextQuestionButton.setVisibility(View.VISIBLE);
                correctAnswerText.setVisibility(View.VISIBLE);
                trueButton.setVisibility(View.INVISIBLE);
                falseButton.setVisibility(View.INVISIBLE);}



        ;