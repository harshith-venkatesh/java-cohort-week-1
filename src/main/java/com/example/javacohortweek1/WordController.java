package com.example.javacohortweek1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class WordController {
    @Autowired
    private DictionaryWord fetchWord;

    @GetMapping("/")
    public String welcomePage(){
        return "Welcome to word display, head over to `/word` to get latest word";
    }

    @GetMapping("/word")
    public String getWord() {
        return fetchWord.getWord();
    }

    @PostMapping("/word")
    public String postWord(@RequestBody DictionaryWord name) {
        fetchWord.setWord(name.getWord());
        return "word added successfully";
    }

}