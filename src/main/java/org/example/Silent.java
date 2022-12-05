package org.example;

public class Silent implements PhoneState {
    @Override
    public String alert() {
        return "Silent!";
    }
}
