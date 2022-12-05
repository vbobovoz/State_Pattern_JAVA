package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SilentTest {
    @Test
    public void DefaultSilent() {
        PhoneContext phoneContext = new PhoneContext();
        assertEquals("Silent!", phoneContext.alert());
    }

    @Test
    public void SetStateSilent() {
        PhoneContext phoneContext = new PhoneContext();
        phoneContext.setCurState(new Silent());
        assertEquals("Silent!", phoneContext.alert());
    }
}
