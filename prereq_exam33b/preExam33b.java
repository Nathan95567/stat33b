package prereq_exam33b;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.List;

public class preExam33b {

    /**
     * Exercise 1
     * Write a function that converts a temperature in Fahrenheit to Kelvin. The conversion
     * formula is
     * k = (f −32)(5/9) + 273.15
     * Test your function on at least 3 different temperatures, and use Google to confirm that the
     * converted values are correct.
     */
    public static double exercise1(int fahrenheit) {
        double k;
        k = ((fahrenheit - 32) * 5 / 9 + 273.15);
        return k;
    }

    /**
     * Exercise 2
     * The nth triangular number is equal to the sum of the n natural numbers from 1 to n. Thus
     * the first 10 triangular numbers are:
     * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55
     * Write a function with a parameter k that prints out the first k triangular numbers. Test
     * your function for k = 10, k = 20, and k = 50.
     */
    public static ArrayList<Integer> exercise2(int k) {
        ArrayList a = new ArrayList<Integer>();
        for (int i = 2 ; i < k + 2; i++) {
            int j1 = 0;
            int j2 = 0;
            for (int j = 1; j < i; j++) {
                j1 = j;
                j2 = j2 + j1;
            }
            a.add(j2);
        }
        return a;
    }

    /**
     * Exercise 3
     * Fizzbuzz is a word game to help children learn about division. Players count off numbers,
     * replacing each number divisible by 3 with “fizz”, each number divisible by 5 with “buzz”,
     * and each number divisible by 3 and 5 with “fizzbuz”.
     * Thus the fizzbuzz sequence for the first 16 numbers is:
     * 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuz, 16
     * Write a program that prints the fizzbuzz sequence for the first 200 numbers.
     */
}
