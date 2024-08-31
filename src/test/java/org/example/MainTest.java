package org.example;

import org.junit.jupiter.api.Test;
import org.learning.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testexample() {
        Main mainClass = new Main();
        assertEquals(4, mainClass.addNumbers(2, 2));
    }
}