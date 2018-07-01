//package com.gteckkdevelopers.solvethis;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class QuizPanel extends AppCompatActivity {
//
//    private QuizLibrary mQuestionLibrary = new QuizLibrary();
//
//    private TextView mScoreView;
//    private TextView mQuestionView;
//    private TextView mQuestionTwoView;
//    private TextView mQuestionThreeView;
//    private TextView mQuestionFourView;
//    private Button qOneChoice1;
//    private Button qOneChoice2;
//    private Button qOneChoice3;
//
//    private String mAnswer;
//    private int mScore = 0;
//    private int mQuestionNumber = 0;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_quiz_panel);
//
//        mScoreView = (TextView)findViewById(R.id.score);
//        mQuestionView = (TextView)findViewById(R.id.questionOne);
//        qOneChoice1 = (Button)findViewById(R.id.qOneChoice1);
//        qOneChoice2 = (Button)findViewById(R.id.qOneChoice2);
//        qOneChoice3 = (Button)findViewById(R.id.qOneChoice3);
//
//        updateQuestion();
//
//        //Start of Button Listener for Button1
//        qOneChoice1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                //My logic for Button goes in here
//
//                if (qOneChoice1.getText() == mAnswer){
//                    mScore = mScore + 1;
//                    updateScore(mScore);
//                    updateQuestion();
//                    //This line of code is optiona
//                    Toast.makeText(QuizPanel.this, "correct", Toast.LENGTH_SHORT).show();
//
//                }else {
//                    Toast.makeText(QuizPanel.this, "wrong", Toast.LENGTH_SHORT).show();
//                    updateQuestion();
//                }
//            }
//        });
//
//        //End of Button Listener for Button1
//
//        //Start of Button Listener for Button2
//        qOneChoice2.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                //My logic for Button goes in here
//
//                if (qOneChoice2.getText() == mAnswer){
//                    mScore = mScore + 1;
//                    updateScore(mScore);
//                    updateQuestion();
//                    //This line of code is optiona
//                    Toast.makeText(QuizPanel.this, "correct", Toast.LENGTH_SHORT).show();
//
//                }else {
//                    Toast.makeText(QuizPanel.this, "wrong", Toast.LENGTH_SHORT).show();
//                    updateQuestion();
//                }
//            }
//        });
//
//        //End of Button Listener for Button2
//
//
//        //Start of Button Listener for Button3
//        qOneChoice3.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                //My logic for Button goes in here
//
//                if (qOneChoice3.getText() == mAnswer){
//                    mScore = mScore + 1;
//                    updateScore(mScore);
//                    updateQuestion();
//                    //This line of code is optiona
//                    Toast.makeText(QuizPanel.this, "correct", Toast.LENGTH_SHORT).show();
//
//                }else {
//                    Toast.makeText(QuizPanel.this, "wrong", Toast.LENGTH_SHORT).show();
//                    updateQuestion();
//                }
//            }
//        });
//
//        //End of Button Listener for Button3
//
//
//
//
//
//    }
//
//    private void updateQuestion(){
//        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
//        qOneChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
//        qOneChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
//        qOneChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
//
//        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
//        mQuestionNumber++;
//    }
//
//
//    private void updateScore(int point) {
//        mScoreView.setText("" + mScore);
//    }
//}
