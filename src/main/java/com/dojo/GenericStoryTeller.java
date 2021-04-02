package com.dojo;

import io.vavr.control.Option;

public class GenericStoryTeller implements StoryTeller {

    private final int secretNumber;
    private final String word;

    private GenericStoryTeller(final int secretNumber, final String word) {
        this.secretNumber = secretNumber;
        this.word = word;
    }

    @Override
    public Option<String> speakOf(int number) {
        return number % secretNumber == 0 ? Option.some(word) : Option.none();
    }

    public static StoryTeller createFor(int secretNumber, String word) {
        return new GenericStoryTeller(secretNumber, word);
    }
}
