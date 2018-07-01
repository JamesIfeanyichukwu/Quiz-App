package com.gteckkdevelopers.solvethis;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class QuizPanel extends AppCompatActivity {

    private boolean checked1, checked2, checked3, checked4;
    RadioButton qOneChoiceOne, qOneChoiceTwo, qOneChoiceThree;
    RadioButton qTwoChoiceOne, qTwoChoiceTwo, qTwoChoiceThree;
    RadioButton qThreeChoiceOne, qThreeChoiceTwo, qThreeChoiceThree;
    TextView score_text, score_value;
    EditText nEditText;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    Button btnSubmit, btnQuit, btnReset;
    RadioGroup qOneRadio, qTwoRadio, qThreeRadio;

    private int score1, score2, score3, score4, score5, totalScore;

    private String qFiveAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_panel);

        qOneChoiceOne = (RadioButton) findViewById(R.id.qOneChoice1);
        qOneChoiceTwo = (RadioButton) findViewById(R.id.qOneChoice2);
        qOneChoiceThree = (RadioButton) findViewById(R.id.qOneChoice3);

        qTwoChoiceOne = (RadioButton) findViewById(R.id.qTwoChoice1);
        qTwoChoiceTwo = (RadioButton) findViewById(R.id.qTwoChoice2);
        qTwoChoiceThree = (RadioButton) findViewById(R.id.qTwoChoice3);

        qThreeChoiceOne = (RadioButton) findViewById(R.id.qThreeChoice1);
        qThreeChoiceTwo = (RadioButton) findViewById(R.id.qThreeChoice2);
        qThreeChoiceThree = (RadioButton) findViewById(R.id.qThreeChoice3);

        score_text = (TextView) findViewById(R.id.score_text);
        score_value = (TextView) findViewById(R.id.score);

        btnSubmit = (Button) findViewById(R.id.submit);
        btnQuit = (Button) findViewById(R.id.quit);
        btnReset = (Button) findViewById(R.id.reset);

        nEditText = (EditText) findViewById(R.id.edit_text_box);

        checkBox1 = (CheckBox) findViewById(R.id.box_choice1);
        checkBox2 = (CheckBox) findViewById(R.id.box_choice2);
        checkBox3 = (CheckBox) findViewById(R.id.box_choice3);
        checkBox4 = (CheckBox) findViewById(R.id.box_choice4);

        qOneRadio = (RadioGroup) findViewById(R.id.radioOne);
        qTwoRadio = (RadioGroup) findViewById(R.id.radioTwo);
        qThreeRadio = (RadioGroup) findViewById(R.id.radioThree);


        //This button is used to submit the quiz and allow user(s) see their scores.
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checked1 && checked2 && checked3 && checked4) {

                    qFiveAnswer = nEditText.getText().toString();
                    if (qFiveAnswer.toLowerCase().equals("true"))
                        score5 = 20;
                    else score5 = 0;

                    // this is to count the number of check boxes selected and their overall values
                    score4 = 0;
                    if (checkBox1.isChecked()) {
                        score4 += +12;
                    }
                    if (checkBox2.isChecked()) {
                        score4 += -8;
                    }
                    if (checkBox3.isChecked()) {
                        score4 += -12;
                    }
                    if (checkBox4.isChecked()) {
                        score4 += +8;
                    }

                    if (score4 <= 0) {
                        score4 = 0;
                    }


                    totalScore = score1 + score2 + score3 + score4 + score5;
                    String answer = getString(R.string.you_scored) + "  " + totalScore;
                    Toast.makeText(getApplicationContext(), answer, Toast.LENGTH_LONG).show();

                    score_value.setText(" " + totalScore);

                } else {
                    Context context = getApplicationContext();
                    String text = getString(R.string.check_if_all_questions_answered);
                    int extent = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, extent);
                    toast.show();
                }

            }
        });

        // When this button is clicked, the application closes
        btnQuit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                quit();
            }

        });

        // This is used to reset the application so user(s) can start afresh
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetRadioGroup(qOneRadio);
                resetRadioGroup(qTwoRadio);
                resetRadioGroup(qThreeRadio);
                reset();
                uncheckCheckBoxes();
                setScoresToZero();
            }
        });
    }


    //This method handles what happens when radio button options for question one are selected
    public void onRadioBtnCheckQuestionOne(View view) {
        checked1 = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.qOneChoice1:
                if (checked1) {
                    score1 = 20;
                    break;
                }
            case R.id.qOneChoice2:
                if (checked1) {
                    score1 = 0;
                    break;
                }
            case R.id.qOneChoice3:
                if (checked1) {
                    score1 = 0;
                    break;
                }
        }
    }

    //This method handles what happens when radio button options for question two are selected
    public void onRadioBtnCheckQuestionTwo(View view) {
        checked2 = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.qTwoChoice1:
                if (checked2) {
                    score2 = 0;
                    break;
                }
            case R.id.qTwoChoice2:
                if (checked2) {
                    score2 = 20;
                    break;
                }
            case R.id.qTwoChoice3:
                if (checked2) {
                    score2 = 0;
                    break;
                }
        }
    }

    //This method handles what happens when radio button options for question three are selected
    public void onRadioBtnCheckQuestionThree(View view) {
        checked3 = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.qThreeChoice1:
                if (checked3) {
                    score3 = 20;
                    break;
                }
            case R.id.qThreeChoice2:
                if (checked3) {
                    score3 = 0;
                    break;
                }
            case R.id.qThreeChoice3:
                if (checked3) {
                    score3 = 0;
                    break;
                }
        }
    }

    //This method is used to optionally select options for the checkbox
    public void onCheckBoxQuestion4(View view) {
        checked4 = checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked();

    }

    //method to quit the application
    private void quit() {
        this.finish();

    }

    //Method to reset the application
    public void reset() {

        nEditText.setText("");
    }

    //method to uncheck the radio buttons
    private void resetRadioGroup(RadioGroup radioGroup) {
        radioGroup.clearCheck();
    }

    //method to uncheck the CheckBoxes
    private void uncheckCheckBoxes() {
        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
        checkBox4.setChecked(false);
        checked4 = false;
    }

    //method to set the scores of the user to zero. This is called when the reset button is clicked
    private void setScoresToZero() {
        score1 = score2 = score3 = score4 = score5 = 0;

    }

}
//&& qFiveAnswer.equals(" ")