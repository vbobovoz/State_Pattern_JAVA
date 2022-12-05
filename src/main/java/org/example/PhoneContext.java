package org.example;

public class PhoneContext {
    private PhoneState curState;
    public PhoneContext() {
        curState = new Silent();
    }

    public void setCurState(PhoneState state) {
        curState = state;
    }

    public String alert() {
        return curState.alert();
    }
}
