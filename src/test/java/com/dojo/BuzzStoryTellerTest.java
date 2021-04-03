package com.dojo;

import io.vavr.control.Option;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BuzzStoryTellerTest {

    private StoryTeller buzzStoryTeller;

    @BeforeEach
    public void setUp() {
        buzzStoryTeller = BuzzStoryTeller.create();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 6, 7, 8, 9})
    public void sayNothing(int number) {
        assertThat(buzzStoryTeller.speakOf(number), is(Option.none()));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 15, 225})
    public void sayBuzz(int number) {
        assertThat(buzzStoryTeller.speakOf(number), is(Option.some("Buzz")));
    }
}
