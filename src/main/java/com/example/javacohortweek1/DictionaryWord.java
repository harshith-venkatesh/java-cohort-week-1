package com.example.javacohortweek1;

import org.springframework.stereotype.Component;

@Component
public class DictionaryWord {
    private String word;

    public DictionaryWord() {
        this.word = "Initial Word";
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}