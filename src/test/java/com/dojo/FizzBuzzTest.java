package com.dojo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = FizzBuzz.create();
    }

    @Test
    public void sayNumber() {
        assertThat(fizzBuzz.say(1), is("1"));
    }

    @Test
    public void sayFizz() {
        assertThat(fizzBuzz.say(3), is("Fizz"));
    }

    @Test
    public void sayBuzz() {
        assertThat(fizzBuzz.say(5), is("Buzz"));
    }

    @Test
    public void sayFizzBuzz() {
        assertThat(fizzBuzz.say(15), is("FizzBuzz"));
    }

}
