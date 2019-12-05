package com.hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day20Sorting {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Given an array 'a' of size 'n' distinct elements,
        // sort the array in ascending order using the Bubble Sort
        int numberOfSwaps = 0;
        // Always use 2 loops in bubble sort,
        // otherwise it will only iterate through
        // the array once
        for(int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                    numberOfSwaps++;
                }
            }
        }
        // Then print 3 lines:
        //Array is sorted in numSwaps
        System.out.println("Array is sorted in " + numberOfSwaps + "swaps");
        //First Element: firstElement
        System.out.println("First Element:" + a[0]);
        //Last Element: lastElement
        System.out.println("Last Element: " + (a[n-1]));
    }
}
