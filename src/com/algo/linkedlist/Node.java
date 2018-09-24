package com.algo.linkedlist;

/**
 * Created by ardas on 9/14/2018.
 */
public class Node {

	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Node node = (Node) o;
		return data == node.data && next == node.next;
	}

	public void print() {
		System.out.print(this.data);
	}

	public void printCharValue() {
		System.out.print((char)this.data);
	}
}
