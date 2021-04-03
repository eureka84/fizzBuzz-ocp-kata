package com.dojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
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
