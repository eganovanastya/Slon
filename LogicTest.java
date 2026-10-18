package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlonLogicTest {

    @Test
    void start() {
        SlonLogic l = new SlonLogic();
        assertEquals(new PhrasesSlon().getHelp(), l.start());
    }

    @Test
    void FlagIsTrue() {
        SlonLogic l = new SlonLogic();
        assertTrue(l.bool());
    }

    @Test
    void ifelseQTrue() {
        SlonLogic l = new SlonLogic();
        assertEquals(new PhrasesSlon().getEnd(), l.ifelse("\\q"));
    }

    @Test
    void ifelseQFalse() {
        SlonLogic l = new SlonLogic();
        l.ifelse("\\q");
        assertFalse(l.bool());
    }

    @Test
    void ifelseHelp() {
        SlonLogic l = new SlonLogic();
        assertEquals(new PhrasesSlon().getHelp(), l.ifelse("\\help"));
    }


    @Test
    void ifelseDefault() {
        SlonLogic l = new SlonLogic();
        String result = l.ifelse("Привет");
        assertTrue(result.contains("Привет"));
        assertTrue(result.contains("купи слона"));
    }


}