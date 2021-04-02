package com.dojo;

public class GenericStoryTeller implements StoryTeller {
    private final int secretNumber;
    private final String word;

    private GenericStoryTeller(int secretNumber, String word) {
        this.secretNumber = secretNumber;
        this.word = word;
    }

    @Override
    public String speakOf(int number) {
        return number % secretNumber == 0 ? word : "";
    }

    public static StoryTeller createFor(int secretNumber, String word) {
        return new GenericStoryTeller(secretNumber, word);
    }
}
