package com.algo.linkedlist;

import java.util.Scanner;

/**
 * Created by ardas on 9/14/2018.
 */
public class TestLinkedList {


    public static void main(String[] args) {
        Printer.printOptions();
        while (true) {
            lineBreak();
            System.out.println("ENTER YOUR CHOICE:");
            Scanner s = new Scanner(System.in);
            int option = Integer.parseInt(s.nextLine());
            switch (option) {
                case 1:
                    testNthLastNode();
                    break;
                case 2:
                    testCircularLinkedList();
                    break;
                case 3:
                    testReverse();
                    break;
                case 4:
                    testPalindrome();
                    break;
                case 5:
                    testLinkedListIntersection();
                    break;
                case 0:
                    System.out.println("EXITING THE PROGRAM......");
                    System.exit(0);
            }
        }
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

    private static void testPalindrome() {
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        LinkedList linkedList = new LinkedList("MADAM");
        System.out.println("Is MADAM is Palindrome usingStack: " + checkPalindrome.usingStack(linkedList.head));
        System.out.println("Is MADAM is Palindrome usingHalfStack: " + checkPalindrome.usingHalfStack(linkedList.head));
        System.out.println("Is MADAM is Palindrome isPalindrome: " + checkPalindrome.isPalindrome(linkedList.head));

        linkedList = new LinkedList("ARPAN DAS");
        System.out.println("Is ARPAN DAS is Palindrome usingStack: " + checkPalindrome.usingStack(linkedList.head));
        System.out.println("Is ARPAN DAS is Palindrome usingHalfStack: " + checkPalindrome.usingHalfStack(linkedList.head));
        System.out.println("Is ARPAN DAS is Palindrome isPalindrome: " + checkPalindrome.isPalindrome(linkedList.head));

        linkedList = new LinkedList("12321");
        System.out.println("Is 12321 is Palindrome usingStack: " + checkPalindrome.usingStack(linkedList.head));
        System.out.println("Is 12321 is Palindrome usingHalfStack: " + checkPalindrome.usingHalfStack(linkedList.head));
        System.out.println("Is 12321 is Palindrome isPalindrome: " + checkPalindrome.isPalindrome(linkedList.head));

        linkedList = new LinkedList("S");
        System.out.println("Is S is Palindrome usingStack: " + checkPalindrome.usingStack(linkedList.head));
        System.out.println("Is S is Palindrome usingHalfStack: " + checkPalindrome.usingHalfStack(linkedList.head));
        System.out.println("Is S is Palindrome isPalindrome: " + checkPalindrome.isPalindrome(linkedList.head));

        linkedList = new LinkedList("SA");
        System.out.println("Is SA is Palindrome usingStack: " + checkPalindrome.usingStack(linkedList.head));
        System.out.println("Is SA is Palindrome usingHalfStack: " + checkPalindrome.usingHalfStack(linkedList.head));
        System.out.println("Is SA is Palindrome isPalindrome: " + checkPalindrome.isPalindrome(linkedList.head));
    }

    private static void testLinkedListIntersection() {
        LinkedList linkedList = new LinkedList(10);
        LinkedList linkedList1 = new LinkedList(5);
        System.out.println("List 1 before merging: ");
        ListUtil.printList(linkedList.head);
        lineBreak();
        System.out.println("List 2 before merging: ");
        ListUtil.printList(linkedList1.head);
        lineBreak();
        ListUtil.mergeLinkedList(linkedList.head, linkedList1.head, 4);
        lineBreak();
        System.out.println("List 2 after merging: ");
        ListUtil.printList(linkedList1.head);
        lineBreak();
        CheckIntersection checkIntersection = new CheckIntersection();
        System.out.println("If both the list intersect bySeenMethod : "
                + checkIntersection.bySeenMethod(linkedList.head, linkedList1.head));
        System.out.println("If both the list intersect check : "
                + checkIntersection.check(linkedList.head, linkedList1.head));
    }

    public static void lineBreak() {
        System.out.println();
    }
}
