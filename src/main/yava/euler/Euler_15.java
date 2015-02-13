package yava.euler;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.time.Duration;
import java.time.Instant;

public class Euler_15 {

    private static final int grid = 20;

    /*
    Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
    How many such routes are there through a 20×20 grid?
    */
    public static void main(String[] args) {
        Instant start = Instant.now();

        long[][] array = new long[grid+1][grid+1];
        for (int i = 0; i < grid; i++) {
            array[i][grid] = 1;
            array[grid][i] = 1;
        }

        for (int i = grid - 1; i >= 0; i--) {
            for (int j = grid - 1; j>=0; j--) {
                array[i][j] = array[i+1][j] + array[i][j+1];
            }
        }
        Instant end = Instant.now();
        System.out.println("Lattice routes for " + grid + "x" + grid + " grid: " + array[0][0]);
        System.out.println("Execution time: " + Duration.between(start, end));
    }
}
