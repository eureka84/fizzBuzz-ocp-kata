package com.dojo;

import io.vavr.collection.List;

public class FizzBuzz {

    private final StoryTeller storyTeller;

    private FizzBuzz(StoryTeller... storyTellers) {
        storyTeller = List.of(storyTellers).reduce(StoryTeller::combine);
    }

    public String say(int number) {
        return storyTeller.speakOf(number).getOrElse(() -> repeatThe(number));
    }

    private String repeatThe(int number) {
        return String.valueOf(number);
    }

    public static FizzBuzz create() {
        return new FizzBuzz(FizzStoryTeller.create(), BuzzStoryTeller.create());
    }

}
