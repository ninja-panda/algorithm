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

	public static int length(Node head) {
		int length = 0;
		while (head != null) {
			length++;
			head = head.next;
		}
		return length;
	}
}
