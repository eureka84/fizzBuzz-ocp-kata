package com.dojo;

public class FizzStoryTeller {

    public static StoryTeller create(){
        return GenericStoryTeller.createFor(3, "Fizz");
    }

}
