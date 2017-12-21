package com.lastminute.dojo;

public class FizzTeller implements Teller {
    @Override
    public String speakOf(int number) {
        return number % 3 == 0 ? "Fizz" : "";
    }
}
