package com.hackerrank.ThirtyDaysOfCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28RegExPatterns {



    private static final Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList<String> names = new ArrayList<String>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            // Methods split input string into 2 parts
            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];



            Pattern p = Pattern.compile(".*@gmail.com");
            Matcher m = p.matcher(emailID);
            // Condition where emailID pattern match
            // if it does, print firstName
            if (m.find() == true) {

                names.add(firstName);

            }
        }
        // Sort the array by name
        Collections.sort(names);
        for(String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
