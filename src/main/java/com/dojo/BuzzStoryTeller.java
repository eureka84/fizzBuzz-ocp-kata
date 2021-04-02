package com.dojo;

public class BuzzStoryTeller {
    public static StoryTeller create() {
        return GenericStoryTeller.createFor(5, "Buzz");
    }
}
