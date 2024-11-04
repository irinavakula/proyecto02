package com.mycompany.app;

import org.junit.jupiter.api.Test;



public class PepeTest {
    @Test
    public void testSumar() {
        Pepe sut = new Pepe();
        int resultado = sut.sumar(a=4, b=3);
        assertTrue( resultado == 7);
    }
}