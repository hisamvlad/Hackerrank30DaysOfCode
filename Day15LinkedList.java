package com.hackerrank.ThirtyDaysOfCode;

import java.util.LinkedList;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15LinkedList {

    LinkedList<Integer> list = new LinkedList<>();

    public static  Node insert(Node head,int data) {
        //if list is empty, return new Node

        if(head == null) {
            return new Node(data);
        }
        //else, traverse through the list, append it with
        // the new node and return head
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            //Insert the Node at the tail for link list referenced
            //by the head param
            temp.next = new Node(data);
            // then return the reference to the head node.
            return head;
        }
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
