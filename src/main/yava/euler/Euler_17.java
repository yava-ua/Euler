package yava.euler;

import yava.euler.utils.Utils;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

public class Euler_17 {

/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
*/

    public static void main(String[] args) {
        Instant start = Instant.now();

        System.out.println(Utils.getNumberInWords(999000));

        long count = LongStream.range(1, 1001)
                .mapToObj(Utils::getNumberInWords)
                        //.peek(System.out::println)
                .map(s -> s.replaceAll(" ", ""))
                .mapToLong(String::length)
                        //.peek(System.out::println)
                .sum();

        Instant end = Instant.now();

        System.out.println("Result: " + count);
        System.out.println("Execution time: " + Duration.between(start, end));
    }
}
