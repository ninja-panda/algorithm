package com.algo.linkedlist;

import java.util.Objects;

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
		return data == node.data &&
				Objects.equals(next, node.next);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, next);
	}

	public void print() {
		System.out.print(this.data);
	}
}
