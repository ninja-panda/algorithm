package com.algo.linkedlist;

/**
 * Created by ardas on 9/14/2018.
 */
public class TestLinkedList {

	public static void main(String[] args) {
		testNthLastNode();
		testCircularLinkedList();
	}

	public static void testNthLastNode() {
		LinkedList linkedList = new LinkedList(10);
		FindNthLastNode findNthLastNode = new FindNthLastNode();
		ListUtil.printList(linkedList.head);
		lineBreak();
		System.out.println("Length of the LinkedList is >>" + ListUtil.length(linkedList.head));
		Node node = findNthLastNode.usingMap(linkedList.head, 3);
		System.out.print("3rd last node of the LinkedList using HashTable is : ");
		node.print();
		lineBreak();
		node = findNthLastNode.byTwoScan(linkedList.head, 3);
		System.out.print("3rd last node of the LinkedList using Two scans is : ");
		node.print();
		lineBreak();
		node = findNthLastNode.byOneScan(linkedList.head, 3);
		System.out.print("3rd last node of the LinkedList using One scans is : ");
		node.print();
	}

	public static void testCircularLinkedList() {
		LinkedList linkedListWithLoop = new LinkedList(10, 3);
		FindLoop findLoop = new FindLoop();
		lineBreak();
		System.out.println("LinkedList has Loop :" + findLoop.hasLoop(linkedListWithLoop.head));
		LinkedList linkedListWithOutLoop = new LinkedList(10);
		System.out.println("LinkedList has Loop :" + findLoop.hasLoop(linkedListWithOutLoop.head));
		System.out.print("Loop starts at:");
		findLoop.loopStartsAt(linkedListWithLoop.head).print();
	}

	public static void lineBreak() {
		System.out.println();
	}

}
