package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhrasesSlonTest {

    @Test
    void helpIsNotNull() {
        PhrasesSlon p = new PhrasesSlon();
        assertNotNull(p.getHelp());
    }

    @Test
    void endReturnsFarewell() {
        PhrasesSlon p = new PhrasesSlon();
        assertEquals("ладно пока", p.getEnd());
    }

    @Test
    void questionEchoesUserInput() {
        PhrasesSlon p = new PhrasesSlon();
        assertTrue(p.getQuestion("Привет").contains("Привет"));
    }

    @Test
    void questionContainsCatchphrase() {
        PhrasesSlon p = new PhrasesSlon();
        assertTrue(p.getQuestion("что угодно").contains("купи слона"));
    }


    @Test
    void questionHandlesEmptyInput() {
        PhrasesSlon p = new PhrasesSlon();
        assertNotNull(p.getQuestion(""));
    }

    @Test
    void differentInputsGiveDifferentOutputs() {
        PhrasesSlon p = new PhrasesSlon();
        assertNotEquals(p.getQuestion("A"), p.getQuestion("B"));
    }
}