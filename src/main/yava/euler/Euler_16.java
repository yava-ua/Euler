package yava.euler;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Euler_16 {

    /*
    2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
    What is the sum of the digits of the number 2^1000?
    */

    public static int getSumOf2Pow(int product) {
        BigInteger productResult = BigInteger.valueOf(2).pow(product);
        return productResult.toString().chars()
                .map(d -> Character.digit(d, 10))
                .sum();
    }

    public static void main(String[] args) {
        Instant start = Instant.now();

        int sum = getSumOf2Pow(1000);

        Instant end = Instant.now();
        System.out.println("Result: " + sum);
        System.out.println("Execution time: " + Duration.between(start, end));
    }
}
