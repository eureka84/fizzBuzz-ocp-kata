package com.dojo;

import io.vavr.control.Option;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzStoryTellerTest {

    private StoryTeller fizzStoryTeller;

    @Before
    public void setUp() {
        fizzStoryTeller = FizzStoryTeller.create();
    }

    @Test
    @Parameters({"3", "6", "9", "12"})
    public void sayFizz(int number) {
        assertThat(fizzStoryTeller.speakOf(number), is(Option.some("Fizz")));
    }

    @Test
    @Parameters({"1", "2", "4", "5", "7", "8", "10", "11"})
    public void sayNothing(int number) {
        assertThat(fizzStoryTeller.speakOf(number), is(Option.none()));
    }
}
