package com.hackerrank.ThirtyDaysOfCode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day9Recursion {

    public static int factorial(int n){
        return (n > 1) ? n * factorial(n - 1) : 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(factorial(n));
    }
}


