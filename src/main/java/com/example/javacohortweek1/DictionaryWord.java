package com.example.javacohortweek1;

import org.springframework.stereotype.Component;

@Component
public class DictionaryWord {
    private String value;

    public DictionaryWord() {
        this.value = "Initial Word";
    }

    public String getWord() {
        return value;
    }

    public void setWord(String word) {
        this.value = word;
    }
}