package com.algo.linkedlist;

import java.util.Stack;

/**
 * Created by ardas on 9/23/2018.
 */
public class CheckPalindrome {

    public boolean usingStack(Node head) {
        boolean isPalindrome = true;
        if (head == null) {
            return false;
        }
        /**
         * Insert the LinkedList in a Stack. So of the LinkedList
         * content is J -> A -> V -> A , then the Stack's POP will
         * give result in reverse order : A -> V -> A - > J
         */
        Node temp = head;
        Stack<Node> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        /**
         * Now traverse the LinkedList and check every POP element
         * from Stack. For a Palindrome every element will match.
         */
        temp = head;
        while (temp != null) {
            if (temp.data != stack.pop().data) {
                isPalindrome = false;
                break;
            }
            temp = temp.next;
        }
        return isPalindrome;
    }

    public boolean usingHalfStack(Node head) {
        boolean isPalindrome = true;
        if (head == null) {
            return false;
        }

        /**
         * First move to the middle of the linked list.
         * PUSH the elements of the first half in a Stack,
         * while finding the middle of the linked list.
         */
        Node fastPtr = head, slowPtr = head;
        Stack<Node> stack = new Stack<>();
        while (fastPtr != null && fastPtr.next != null) {
            stack.push(slowPtr);
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        /**
         * If the linked list is of odd length, then
         * skip the middle elements of the list
         */
        int length = ListUtil.length(head);
        if(length %2 != 0){
            slowPtr = slowPtr.next;
        }

        /**
         * Match the last half of the linked list
         * with the poped elements of the stack
         */
        while (slowPtr != null) {
            int data1 = slowPtr.data;
            int data2 = stack.pop().data;
            if (data1 != data2) {
                isPalindrome = false;
                break;
            }
            slowPtr = slowPtr.next;
        }
        return isPalindrome;
    }

    public static boolean isPalindrome(Node head){
        boolean isPalindrome = true;
        if (head == null) {
            return false;
        }

        // Find the middle node of the linked list
        Node fastPtr = head, slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        Node temp = slowPtr;
        Node tempHead = ListUtil.reverseList(temp);
        fastPtr = head;
        while(tempHead != null){
            if(fastPtr.data != tempHead.data){
                isPalindrome = false;
                break;
            }
            fastPtr = fastPtr.next;
            tempHead = tempHead.next;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList("MADAM");
        boolean test = isPalindrome(linkedList.head);
        System.out.println(test);
    }
}
