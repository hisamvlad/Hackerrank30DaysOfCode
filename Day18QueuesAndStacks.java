package com.hackerrank.ThirtyDaysOfCode;

import java.util.*;

public class Day18QueuesAndStacks {

    // Two instance variables: for stack and for queue

    Queue<Character> queue = new LinkedList<>();

    Stack<Character> stack = new Stack<>();

    //A void pushCharacter(char ch) method that pushes a character onto a stack

    public void pushCharacter(char c) {
        stack.push(c);
    }

    //A void enqueueCharacter(char ch) method that enqueues a char in the queue instance variable

    public void enqueueCharacter(char c) {
        queue.add(c);
    }
    //A char popCharacter() method that pops and returns the character at the top of the stack instance variable

    public char popCharacter() {
       char topStackChar = stack.pop();
        return topStackChar;
    }


    //A char dequeueCharacter() method that dequeues and returns the first character in the queue instance variable
    public char dequeueCharacter() {
        char firstInQueue = queue.remove();
        return firstInQueue;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18QueuesAndStacks p = new Day18QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
