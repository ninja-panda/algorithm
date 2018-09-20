package com.algo.linkedlist;

/**
 * Created by ardas on 9/14/2018.
 */
public class TestLinkedList {

	public static void main(String[] args) {
		testNthLastNode();
		testCircularLinkedList();
		testReverse();
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
		FindLoop findLoop = new FindLoop();
		LinkedList linkedListWithLoop = new LinkedList(10, 3);
		LinkedList linkedListWithOutLoop = new LinkedList(10);
		System.out.println("LinkedList has Loop by FloydCycleDetection: " + findLoop.byFloydCycleDetection(linkedListWithLoop.head));
		System.out.println("LinkedList has Loop by FloydCycleDetection: " + findLoop.byFloydCycleDetection(linkedListWithOutLoop.head));
		lineBreak();
		System.out.print("Loop starts at:");
		findLoop.loopStartsAt(linkedListWithLoop.head).print();
	}

	private static void testReverse() {
		LinkedList linkedList = new LinkedList(10);
		System.out.print("Original List :");
		ListUtil.printList(linkedList.head);
		lineBreak();
		Node head = ListUtil.reverseList(linkedList.head);
		System.out.print("Reversed List :");
		ListUtil.printList(head);

	}

	public static void lineBreak() {
		System.out.println();
	}
}
