package com.example.davidmozos.quiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


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

    private int mIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__quiz);

        // To do - Hay que acabar esto ya!
        // Cambios para ver el Merge Changes

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
