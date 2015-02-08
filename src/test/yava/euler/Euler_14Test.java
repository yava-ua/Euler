package yava.euler;

import org.junit.Test;

import static org.junit.Assert.*;

public class Euler_14Test {

    @Test
    public void testGetChain() throws Exception {
        assertEquals("Chain for 13: ",10, Euler_14.getChain(13));
        assertEquals("Chain for 837799: ", 525, Euler_14.getChain(837799));
    }
}