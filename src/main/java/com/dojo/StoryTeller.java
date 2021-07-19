package com.dojo;

import io.vavr.control.Option;

public interface StoryTeller {
    Option<String> speakOf(int number);

    default StoryTeller combine(StoryTeller other) {
        return number -> this.speakOf(number)
                .map(word -> other.speakOf(number)
                        .map(otherWord -> word + otherWord)
                        .getOrElse(word))
                .orElse(other.speakOf(number));
    }
}
