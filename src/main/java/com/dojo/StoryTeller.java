package com.dojo;

import io.vavr.control.Option;

public interface StoryTeller {
    Option<String> speakOf(int number);

    default StoryTeller combine(StoryTeller other) {
        return number -> this.speakOf(number)
                             .flatMap((word) -> other.speakOf(number)
                                                     .map((otherWord) -> word + otherWord)
                                                     .orElse(Option.of(word)))
                             .orElse(other.speakOf(number));
    }
}
