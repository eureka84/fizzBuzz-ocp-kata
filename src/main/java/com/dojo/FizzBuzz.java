package com.dojo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {

    private final StoryTeller[] storyTellers;

    private FizzBuzz(StoryTeller... storyTellers) {
        this.storyTellers = storyTellers;
    }

    public String say(int number) {
        String whatStoryTellersHaveToSay = letStoryTellersSpeakAboutThe(number);
        if (canBeHeard(whatStoryTellersHaveToSay))
            return whatStoryTellersHaveToSay;
        else
            return repeatThe(number);
    }

    private String letStoryTellersSpeakAboutThe(int number) {
        return Arrays.stream(storyTellers)
                .map(t -> t.speakOf(number))
                .collect(Collectors.joining());
    }

    private boolean canBeHeard(String story) {
        return !story.isEmpty();
    }

    private String repeatThe(int number) {
        return String.valueOf(number);
    }

    public static FizzBuzz create() {
        return new FizzBuzz(FizzStoryTeller.create(), BuzzStoryTeller.create());
    }

}
