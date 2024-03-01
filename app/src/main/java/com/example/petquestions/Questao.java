package com.example.petquestions;

import java.util.List;

public class Questao {
    private String question;
    private List<String> options;
    private int correctOptionIndex;

    public Questao(String question, List<String> options, int correctOptionIndex) {
        this.question = question;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public boolean isCorrect(int selectedOptionIndex) {
        return selectedOptionIndex == correctOptionIndex;
    }
}
