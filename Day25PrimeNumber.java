package com.hackerrank.ThirtyDaysOfCode;


import java.util.Scanner;


public class Day25PrimeNumber {

    static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int testCases = scr.nextInt();
        for(int i = 0; i < testCases; i++) {
            int n = scr.nextInt();
            String output;
            if(n >=2 && isPrime(n)) {
                output ="Prime";
            }  else {
                output="Not Prime";
            }
            System.out.println(output);
        }
      scr.close();
    }
}
