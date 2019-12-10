package com.hackerrank.ThirtyDaysOfCode;

import java.util.*;
import java.io.*;

class Node23{
    Node23 left,right;
    int data;
    Node23(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day23BreadthFirstSearch {

   static Queue<Node23> q = new LinkedList<>();

    static void levelOrder(Node23 root){

       if (root != null) {
           q.add(root);
       }
       while (!q.isEmpty()) {
           Node23 tree = q.remove();
           System.out.print(tree.data + " ");
           if(tree.left != null) {
               q.add(tree.left);
           }
           if (tree.right !=null) {
               q.add(tree.right);
           }

       }


        }


    public static Node23 insert(Node23 root,int data){
        if(root==null){
            return new Node23(data);
        }
        else{
            Node23 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node23 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
