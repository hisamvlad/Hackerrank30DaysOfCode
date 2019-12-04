package com.hackerrank.ThirtyDaysOfCode;

// Write a calculator class with a
// single method: int power(int, int)
// The power method takes 2 integers n, and p as params
// and returns the integer result of n to the power of P
// Check if either n or p is negative
// and throw an exception with
// a message: "n and p should be non-negative"

import java.util.Scanner;

// class NegativeNumbersException extends Exception {}

class Calculator {

        int power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n and p should be non-negative");
            } else {
                return (int)Math.pow(n, p);
            }

        }

    }

public class Day17MoreExceptions {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
