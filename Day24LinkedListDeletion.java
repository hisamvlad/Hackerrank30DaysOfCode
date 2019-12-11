package com.hackerrank.ThirtyDaysOfCode;

import java.util.*;

class Node24{
    int data;
    Node24 next;
    Node24(int d){
        data=d;
        next=null;
    }

}
public class Day24LinkedListDeletion {


    public static Node24 removeDuplicates(Node24 head) {
      //  LinkedList<Integer> myLL = new LinkedList<Integer>();
        // method takes a pointer to head and checks if it's null
        Node24 pointer = head;
        int counter = 0;

        if(pointer == null) {
            return head;
        }
        while(pointer.next != null) {

            if(pointer.data == pointer.next.data) {
                head = pointer.next.next;
            } else {
                head = pointer.next;
            }
           // myLL.add(Node24 data);
          //  counter++;
        }
        // then moves forward and records indexes
        // compares the data values
        // if duplicate, takes the pointer of a previous (non duplicate) node
        // and points it to the next from duplicate node.
        // returns head
        return head;
    }


    public static  Node24 insert(Node24 head,int data)
    {
        Node24 p=new Node24(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node24 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node24 head)
    {
        Node24 start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node24 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
