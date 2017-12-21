package com.lastminute.dojo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {

    private final Teller[] tellers;

    public FizzBuzz(Teller... tellers) {
        this.tellers = tellers;
    }

    public String say(int number) {
        String whatTellersHaveToSay = letTellersSpeakAbout(number);
        return isSomething(whatTellersHaveToSay) ?
                whatTellersHaveToSay :
                theNumber(number);
    }

    private String letTellersSpeakAbout(int number) {
        return Arrays.stream(tellers)
                .map(t -> t.speakOf(number))
                .collect(Collectors.joining());
    }

    private boolean isSomething(String word) {
        return !"".equals(word);
    }

    private String theNumber(int number) {
        return String.valueOf(number);
    }

    public static FizzBuzz create() {
        return new FizzBuzz(new FizzTeller(), new BuzzTeller());
    }
}
