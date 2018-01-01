package com.dojo;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzTellerTest {

    private FizzTeller fizzTeller;

    @Before
    public void setUp() {
        fizzTeller = new FizzTeller();
    }

    @Test
    @Parameters({"3", "6", "9", "12"})
    public void sayFizz(int number) {
        assertThat(fizzTeller.speakOf(number), is("Fizz"));
    }

    @Test
    @Parameters({"1", "2", "4", "5", "7", "8", "10", "11"})
    public void sayNothing(int number) {
        assertThat(fizzTeller.speakOf(number), is(""));
    }
}
