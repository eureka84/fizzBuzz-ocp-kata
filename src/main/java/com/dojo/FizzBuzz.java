package com.dojo;

import io.vavr.collection.List;
import io.vavr.control.Option;

public class FizzBuzz {

    private final StoryTeller[] storyTellers;

    private FizzBuzz(StoryTeller... storyTellers) {
        this.storyTellers = storyTellers;
    }

    public String say(int number) {
        return whatStoryTellersHaveToSayAbout(number).getOrElse(() -> repeatThe(number));
    }

    private Option<String> whatStoryTellersHaveToSayAbout(int number) {
        StoryTeller fizzBuzzStoryTeller = List.of(storyTellers).reduce(StoryTeller::combine);
        return fizzBuzzStoryTeller.speakOf(number);
    }

    private String repeatThe(int number) {
        return String.valueOf(number);
    }

    public static FizzBuzz create() {
        return new FizzBuzz(FizzStoryTeller.create(), BuzzStoryTeller.create());
    }

}
