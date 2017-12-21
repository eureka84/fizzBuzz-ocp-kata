package com.lastminute.dojo;

public class BuzzTeller implements Teller {
    @Override
    public String speakOf(int number) {
        return number %5 == 0 ? "Buzz": "";
    }
}
