package com.algo.linkedlist;

/**
 * Created by ardas on 9/17/2018.
 */
public class ListUtil {

    public static void printList(Node head) {
        while (head != null) {
            head.print();
            head = head.next;
            if (head != null) {
                System.out.print(" --> ");
            }
        }
    }

    public static void printCharList(Node head) {
        while (head != null) {
            head.printCharValue();
            head = head.next;
            if (head != null) {
                System.out.print(" --> ");
            }
        }
    }

    public static int length(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    /**
     * Reverse the LinkedList in iterative way
     *
     * @param head
     * @return
     */
    public static Node reverseList(Node head) {
        Node current = head;
        Node prev = null, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /**
     * Merge two linked list in a given position. head1 is pointing
     * to the longer linked list where head2 is pointing to the
     * shorter linked list. Now this method will merge the smaller
     * linked list to the longer one in the given position, after
     * the intersection both forward towards end together.
     *
     */
    public static void mergeLinkedList(Node head1, Node head2, int position) {
        Node temp = head1;
        for (int i = 1; i <= position - 1; i++) {
            temp = temp.next;
        }
        Node temp2 = head2;
        while (temp2 != null) {
            if (temp2.next == null) {
                temp2.next = temp;
                break;
            }
            temp2 = temp2.next;
        }
    }
}
