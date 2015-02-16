package yava.euler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Euler_16Test {

    @Test
    public void testGetSumOfProductResult() throws Exception {
        assertEquals("Sum of digits in 2^15", 26, Euler_16.getSumOf2Pow(15));
    }
}