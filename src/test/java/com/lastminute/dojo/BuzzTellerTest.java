package com.lastminute.dojo;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class BuzzTellerTest {

    @Test
    @Parameters({"1", "2", "3", "4", "6", "7", "8", "9"})
    public void sayNothing(int number) {
        assertThat(new BuzzTeller().speakOf(number), is(""));
    }

    @Test
    @Parameters({"5", "10", "15", "225"})
    public void sayBuzz(int number) {
        assertThat(new BuzzTeller().speakOf(number), is("Buzz"));
    }
}
