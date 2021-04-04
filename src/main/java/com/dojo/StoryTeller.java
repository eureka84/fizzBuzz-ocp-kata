package com.dojo;

import io.vavr.Tuple2;
import io.vavr.control.Option;

import static io.vavr.API.*;

public interface StoryTeller {
    Option<String> speakOf(int number);

    default StoryTeller combine(StoryTeller other) {
        return number -> Match(new Tuple2<>(this.speakOf(number), other.speakOf(number))).of(
            Case($((t) -> t._1.isDefined() && t._2.isDefined()), (t) -> Option.of(t._1.get() + t._2.get())),
            Case($((t) -> t._1.isDefined() && t._2.isEmpty()), (t) -> t._1),
            Case($((t) -> t._1.isEmpty() && t._2.isDefined()), (t) -> t._2),
            Case($((t) -> t._1.isEmpty() && t._2.isEmpty()), (t) -> Option.none())
        );
    }
}
