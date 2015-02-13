package yava.euler;

import java.time.Duration;
import java.time.Instant;
import java.util.function.LongUnaryOperator;

public class Euler_14 {

    /*
    The following iterative sequence is defined for the set of positive integers:

    n → n/2 (n is even)
    n → 3n + 1 (n is odd)

    Using the rule above and starting with 13, we generate the following sequence:

    13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
    It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

    Which starting number, under one million, produces the longest chain?

    NOTE: Once the chain starts the terms are allowed to go above one million.
    */
    public static LongUnaryOperator evenFunction = (a) -> a / 2;
    public static LongUnaryOperator oddFunction = (a) -> 3 * a + 1;

    public static long getChain(int input) {
        int result = 1;
        long number = input;
        while (number > 1) {
            if (number % 2 == 0) {
                number = evenFunction.applyAsLong(number);
            } else {
                number = oddFunction.applyAsLong(number);
            }
            result++;
        }
        return result;
    }

    public static void main(String[] args) {

        Instant start = Instant.now();
        int maxChain = 10;
        int maxChainNumber = 13;

        for (int i=14; i<1000000;i++) {
            int currentChain = 1;
            long number = i;
            while (number > 1) {
                if (number % 2 == 0) {
                    number = evenFunction.applyAsLong(number);
                } else {
                    number = oddFunction.applyAsLong(number);
                }
                currentChain++;
            }
            if (currentChain > maxChain) {
                maxChain = currentChain;
                maxChainNumber = i;
            }
        }
        Instant end = Instant.now();
        System.out.println("Execution time: " + Duration.between(start, end));

        System.out.println("Max chain number: " + maxChainNumber + ". chain : " + getChain(maxChainNumber));
    }
}
