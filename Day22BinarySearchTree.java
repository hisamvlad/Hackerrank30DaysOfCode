package com.hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;

class BSTNode {
    BSTNode left, right;
    int data;

    BSTNode(int data) {
        this.data = data;
        left = right = null;
    }

}

public class Day22BinarySearchTree {



    public static int getHeight(BSTNode root){
//       if(root==null) {
//           return 0;
//       } else {
//           if(getHeight(root.left) > getHeight(root.right)) {
//              return (getHeight(root.left) + 1);
//           } else {
//               return (getHeight(root.right) + 1);
//           }
//       }
        if(root == null) {
            return -1;
        } else {
            return (1 + getHeight(root.left) + getHeight(root.right));
        }
    }

    public static BSTNode insert(BSTNode root,int data){
        if(root==null){
            return new BSTNode(data);
        }
        else{
            BSTNode cur;
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
        BSTNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
