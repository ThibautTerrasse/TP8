package com.example.admin.tp8;

/**
 * Created by admin on 12/06/2017.
 */

public class VraiFaux {

    private boolean response;

    private String question;
    private String question1;
    private String question2;

    public VraiFaux(String question, String question1, String question2, boolean response){
        this.question=question;
        this.question1=question1;
        this.question2=question2;
        this.response=response;

    }

    public boolean isResponse() {
        return response;
    }

    public String getQuestion() {
        return question;
    }

    public String getQuestion1() {
        return question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }
}
