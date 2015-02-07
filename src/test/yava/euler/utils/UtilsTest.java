package yava.euler.utils;


import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void testIsPrimate() throws Exception {

        assertFalse("Is not primate " + 0, Utils.isPrime(0));
        assertFalse("Is not primate " + 1, Utils.isPrime(1));
        assertTrue("Is primate " + 2, Utils.isPrime(2));
        assertTrue("Is primate " + 3, Utils.isPrime(3));
        assertFalse("Is mot primate " + 4, Utils.isPrime(4));
        assertTrue("Is primate " + 7, Utils.isPrime(7));
        assertTrue("Is primate " + 43, Utils.isPrime(43));
        assertFalse("Is not primate " + 121, Utils.isPrime(121));
        assertTrue("Is primate " + 97, Utils.isPrime(97));
        assertTrue("Is true " + 7481, Utils.isPrime(7481));
        for (int i=7482; i<7487;i++) {
            assertFalse("Is not prime " + i, Utils.isPrime(i));
        }

    }
}