package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class RingingTest {
    @Test
    public void SetStateRinging() {
        PhoneContext phoneContext = new PhoneContext();
        phoneContext.setCurState(new Ringing());
        assertEquals("Ringing!", phoneContext.alert());
    }
}
