package com.algo.linkedlist;

/**
 * Created by ardas on 9/18/2018.
 */
public class FindLoop {

	/**
	 * Finding Loop using Floyd cycle detection algorithm
	 *
	 * @param head
	 * @return
	 */
	public boolean hasLoop(Node head) {
		Node fastPtr = head;
		Node slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (fastPtr != null && fastPtr.equals(slowPtr)) {
				return true;
			}
		}
		return false;
	}

	public Node loopStartsAt(Node head) {
		boolean hasLoop = false;
		Node fastPtr = head;
		Node slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (fastPtr != null && fastPtr.equals(slowPtr)) {
				hasLoop = true;
				break;
			}
		}
		slowPtr = head;
		Node loopStartAt = null;
		if (hasLoop) {
			while (true) {
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next;
				if (slowPtr.equals(fastPtr)) {
					loopStartAt = slowPtr;
					break;
				}
			}
		}
		return loopStartAt;
	}
}
