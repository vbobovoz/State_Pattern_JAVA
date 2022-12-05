package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChargingTest {
    @Test
    public void SetStateCharging() {
        PhoneContext phoneContext = new PhoneContext();
        phoneContext.setCurState(new Charging());
        assertEquals("Charging!", phoneContext.alert());
    }
}
