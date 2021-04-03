package com.dojo;

import io.vavr.control.Option;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzStoryTellerTest {

    private StoryTeller fizzStoryTeller;

    @BeforeEach
    public void setUp() {
        fizzStoryTeller = FizzStoryTeller.create();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    public void sayFizz(int number) {
        assertThat(fizzStoryTeller.speakOf(number), is(Option.some("Fizz")));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 5, 7, 8, 10, 11})
    public void sayNothing(int number) {
        assertThat(fizzStoryTeller.speakOf(number), is(Option.none()));
    }
}
