package com.example.davidmozos.quiz;

/**
 * Created by DavidMozos on 09/10/14.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mAnswer;

    public TrueFalse(int mQuestion, boolean mAnswer) {
        this.mQuestion = mQuestion;
        this.mAnswer = mAnswer;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
