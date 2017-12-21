package com.lastminute.dojo;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz(new FizzTeller());
    }

    @Test
    public void sayNumber() {
        assertThat(fizzBuzz.say(1), is("1"));
    }

    @Test
    public void sayFizz() {
        assertThat(fizzBuzz.say(3), is("Fizz"));
    }
}
