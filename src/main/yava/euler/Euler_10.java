package yava.euler;

import yava.euler.utils.Utils;

public class Euler_10 {

    private static int max = 2000000;

    /*
        The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
        Find the sum of all the primes below two million.
     */

    public static long sumPrimes(int number) {
        if (number < 2) {
            return 0;
        }
        if (number == 2) {
            return 2;
        }
        if (number < 7) {
            return 5;
        }

        long sum = 5;
        for (int i = 4; i < number; i++) {
            if (Utils.isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Running: ");
        System.out.println("Sum of primes up to " + max + ": " + sumPrimes(max));
    }
}