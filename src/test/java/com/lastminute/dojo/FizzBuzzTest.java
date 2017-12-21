package com.lastminute.dojo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @Before
  public void setUp() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void sayNumber() {
    assertThat(fizzBuzz.say(1), is("1"));
  }
}
