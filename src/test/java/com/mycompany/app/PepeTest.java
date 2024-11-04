package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class PepeTest {
    @Test
    public void testSumar() {
        Pepe sut = new Pepe();
        int resultado = sut.sumar(4, 3);
        assertTrue( resultado == 7);
    }
}