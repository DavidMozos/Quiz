package com.example.davidmozos.quiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Activity_Quiz extends Activity {

    private TextView mQuestionLabel;
    private Button mTrueButton;
    private Button mFalseButton;
    private TrueFalse[] mQuestionBank = new TrueFalse[]{
            new TrueFalse(R.string.question_oceans, true),
            new TrueFalse(R.string.question_mideast, false),
            new TrueFalse(R.string.question_africa, false),
            new TrueFalse(R.string.question_americas, true),
            new TrueFalse(R.string.question_asia, true),
    };

    private Button mNextButton;

    private int mIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__quiz);

        mQuestionLabel = (TextView) findViewById(R.id.question_label);
        setQuestionInLabel();

        // Enlazo el botón con el layout (su vista).
        mNextButton = (Button) findViewById(R.id.next_button);
        // Cuando se clica al botón next lanzamos la siguiente pregunta.
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Incrementamos el ID.
                mIndex = (mIndex+1) % mQuestionBank.length;
                // Cojo el Id de la pregunta en la posición del array.
                setQuestionInLabel();
            }
        });

        // Enlazo el botón con el layout (su vista).
        mTrueButton = (Button) findViewById(R.id.true_button);
        // Cuando se clica al botón true, comprobamos y lanzamos la corrección.
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(true);
            }
        });

        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(false);
            }
        });

    }

    private void setQuestionInLabel() {
        int mIdQuestion = mQuestionBank[mIndex].getQuestion();
        // Paso la pregunta (Id) al label del layout (de la vista).
        mQuestionLabel.setText(mIdQuestion);
    }

    private void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue = mQuestionBank[mIndex].isAnswer();
        int messageId = 0;
        if (userPressedTrue == answerIsTrue){
            messageId = R.string.correct_toast;
        } else {
            messageId = R.string.incorrect_toast;
        }

        Toast.makeText(this, messageId, Toast.LENGTH_SHORT);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity__quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
