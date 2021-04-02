package com.dojo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {

    private final Teller[] tellers;

    private FizzBuzz(Teller... tellers) {
        this.tellers = tellers;
    }

    public String say(int number) {
        String whatTellersHaveToSay = letTellersSpeakAboutThe(number);
        if (canBeHeard(whatTellersHaveToSay))
            return whatTellersHaveToSay;
        else
            return repeatThe(number);
    }

    private String letTellersSpeakAboutThe(int number) {
        return Arrays.stream(tellers)
                .map(t -> t.speakOf(number))
                .collect(Collectors.joining());
    }

    private boolean canBeHeard(String word) {
        return !word.isEmpty();
    }

    private String repeatThe(int number) {
        return String.valueOf(number);
    }

    public static FizzBuzz create() {
        return new FizzBuzz(new FizzTeller(), new BuzzTeller());
    }

}
