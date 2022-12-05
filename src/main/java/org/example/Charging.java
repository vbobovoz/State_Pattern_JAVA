package org.example;

public class Charging implements PhoneState {
    @Override
    public String alert() {
        return "Charging!";
    }
}
