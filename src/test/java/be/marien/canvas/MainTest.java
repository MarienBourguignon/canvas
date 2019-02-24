package be.marien.canvas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void get42() {
        Main main = new Main();
        assertEquals("foo", main.getFoo());
    }
}