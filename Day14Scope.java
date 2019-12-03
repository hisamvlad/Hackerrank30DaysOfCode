package com.hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // A class constructor that takes an array of integers as a param
    // and saves it to the elements instance variable

    public Difference(int[] elements) {

        for (int i = 0; i < elements.length; i++) {
            this.elements = elements;

        }

    }
        //A computeDifference method that finds the maximum absolute difference
        //between any 2 numbers in N and stores it in the
        // maximumDifference instance variable
        public void computeDifference () {
        int max = 1;
        int min = 100;


            // method to find maximum absolute difference
            // 0) loops through elements array and picks pairs of integers
            for (int i = 0; i < elements.length; i++) {
             max =   (max > elements[i]) ? (max) : (max = elements[i]);
            }
            for(int j =0; j <elements.length; j++) {
                min = (min < elements[j]) ? (min) : (min = elements[j]);
            }

            this.maximumDifference = Math.abs(max - min);
        }

}

public class Day14Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
