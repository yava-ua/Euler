package yava.euler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Euler_10Test {

    @Test
    public void testSumPrimes() throws Exception {
        assertEquals("Sum of up to " + 2, 2, Euler_10.sumPrimes(2));
        assertEquals("Sum of up to " + 6, 5, Euler_10.sumPrimes(6));
        assertEquals("Sum of up to " + 10, 17, Euler_10.sumPrimes(10));
        assertEquals("Sum of up to " + 100, 1060, Euler_10.sumPrimes(100));
    }
}