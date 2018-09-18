package com.algo.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ardas on 9/14/2018.
 */
public class FindNthLastNode {

	public Node usingMap(Node head, int n) {
		Map<Integer, Node> nodeByIndex = new HashMap<>();
		int index = 1;
		while (head != null) {
			nodeByIndex.put(index, head);
			head = head.next;
			index++;
		}
		int nthLastElementIndex = (nodeByIndex.size() - n + 1);
		return nodeByIndex.get(nthLastElementIndex);
	}

	public Node byTwoScan(Node head, int n) {
		int length = ListUtil.length(head);
		int index = (length - n + 1);
		for (int i = 1; i < index; i++) {
			head = head.next;
		}
		return head;
	}

	public Node byOneScan(Node head, int n) {
		Node ptr1 = head, ptr2 = null;
		// First pointer is making n number of moves
		for (int i = 1; i < n; i++) {
			if (ptr1 != null) {
				ptr1 = ptr1.next;
			}
		}
		// Now both pointer will make a move until
		// ptr1 reaches the end of the list
		while (ptr1 != null) {
			if (ptr2 == null) {
				ptr2 = head;
			} else {
				ptr2 = ptr2.next;
			}
			ptr1 = ptr1.next;
		}
		if (ptr2 != null) {
			return ptr2;
		}
		return null;
	}
}
