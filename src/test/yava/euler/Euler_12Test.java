package yava.euler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Euler_12Test {

    @Test
    public void testGetDivisorQuantity() throws Exception {
        assertEquals("Divisors quantity for "+ 28, 6, Euler_12.getDivisorQuantity(28));
        assertEquals("Divisors quantity for "+ 13, 2, Euler_12.getDivisorQuantity(28));
    }
}