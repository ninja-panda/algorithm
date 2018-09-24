package com.algo.linkedlist;

/**
 * Created by ardas on 9/14/2018.
 */
public class LinkedList {

	Node head;

	/**
	 * Create a Singly LinkedList of given size
	 *
	 * @param size Size of the LinkedList
	 */

	public LinkedList(int size) {
		head = new Node(1);
		Node tempNode = head;
		for (int i = 2; i <= size; i++) {
			Node node = new Node(i);
			tempNode.next = node;
			tempNode = tempNode.next;
		}
	}

	/**
	 * Create a LinkedList with a Loop
	 *
	 * @param size        Size of the LinkedList
	 * @param loopStartAt where the Loop Start
	 */
	public LinkedList(int size, int loopStartAt) {
		head = new Node(1);
		Node tempNode = head;
		for (int i = 2; i <= size; i++) {
			Node node = new Node(i);
			tempNode.next = node;
			tempNode = tempNode.next;
		}
		Node loop = head;
		for (int i = 1; i < loopStartAt; i++) {
			loop = loop.next;
		}
		tempNode.next = loop;
	}

	/**
	 * Create a LinkedList from a String
	 *
	 * @param str str is the Content of the linked list
	 */
	public LinkedList(String str) {
		char[] charArray = str.toCharArray();
		head = new Node(charArray[0]);
		Node tempNode = head;
		for (int i = 1; i < charArray.length; i++) {
			Node node = new Node(charArray[i]);
			tempNode.next = node;
			tempNode = tempNode.next;
		}
	}
}
