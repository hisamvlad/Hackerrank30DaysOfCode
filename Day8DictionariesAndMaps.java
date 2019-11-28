package com.hackerrank.ThirtyDaysOfCode;

import java.util.*;

public class Day8DictionariesAndMaps {
    public static void main(String []argh){
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        // variable to hold map's size
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

            // Maps friends names to their respective phone numbers
            phoneBook.put(name, phone);
            // For each name queried, print the
            // associated entry from phone book on a new
            // line in the form name=phoneNumber;
            // if record doesn't exist, print
            // "Not found"


        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsValue(phoneBook.get(s))) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else System.out.println("Not found");

        }
        in.close();
    }
}

