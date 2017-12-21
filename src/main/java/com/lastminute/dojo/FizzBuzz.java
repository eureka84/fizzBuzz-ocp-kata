package com.lastminute.dojo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {

    private final Teller[] tellers;

    public FizzBuzz(Teller... tellers) {
        this.tellers = tellers;
    }

    public String say(int number) {
        String word = Arrays.stream(tellers)
                .map(t -> t.speakOf(number))
                .collect(Collectors.joining());
        return "".equals(word)? String.valueOf(number) : word;
    }
}
