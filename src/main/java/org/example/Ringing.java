package org.example;

public class Ringing implements PhoneState {
    @Override
    public String alert() {
        return "Ringing!";
    }
}
