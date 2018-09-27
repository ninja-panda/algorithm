package com.algo.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class CheckIntersection {

    public boolean bySeenMethod(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return false;
        }

        // Find the shorter linked list
        boolean result = false;
        Node shorterOne, longerOne = null;
        int len1 = ListUtil.length(head1);
        int len2 = ListUtil.length(head2);
        shorterOne = len1 > len2 ? head2 : head1;
        longerOne = shorterOne == head1 ? head2 : head1;

        Set<Node> seen = new HashSet<>();
        while (shorterOne != null) {
            seen.add(shorterOne);
            shorterOne = shorterOne.next;
        }

        while (longerOne != null) {
            if (seen.contains(longerOne)) {
                System.out.println("Both the LinkedList are intersected at position " +
                        "where the node value is : " + longerOne.data);
                result = true;
                break;
            }
            longerOne = longerOne.next;
        }
        return result;
    }

    public boolean check(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return false;
        }
        boolean result = false;
        Node shorterOne = null, longerOne = null;
        int len1 = ListUtil.length(head1);
        int len2 = ListUtil.length(head2);
        if (len1 > len2) {
            longerOne = head1;
            shorterOne = head2;
        } else {
            longerOne = head2;
            shorterOne = head1;
        }

        int difference = len1 > len2 ? (len1 - len2) : (len2 - len1);
        for (int i = 0; i < difference; i++) {
            if (longerOne != null) {
                longerOne = longerOne.next;
            }
        }

        while (longerOne != null || shorterOne != null) {
            if (longerOne.equals(shorterOne)) {
                result = true;
                break;
            }
            longerOne = longerOne.next;
            shorterOne = shorterOne.next;
        }
        return result;
    }
}
