package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMain {

    @Test
    public void testLucky() {
        assertEquals(7, Main.getLucky());
    }
    
    @Test
    public void testHelloWorld() {
        assertEquals("hello world", Main.getHelloWorld());
    }

    @Test
    public void testNumber10() {
        assertEquals(10, Main.getNumber10());
    }

}