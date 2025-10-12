package com.scott.dsa.section4;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.append(3);
        myLinkedList.append(5);
        myLinkedList.append(6);

        myLinkedList.prepend(1);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.print("\n**** REMOVE LAST METHOD *****");
        System.out.print("\nRemoved from the end of LL: " + myLinkedList.removeLast().value);
        System.out.print("\nRemoved from the end of LL: " + myLinkedList.removeLast().value);
        System.out.print("\nRemoved from the end of LL: " + myLinkedList.removeLast());

        System.out.print("\n**** REMOVE FIRST METHOD *****");
        System.out.print("\nRemoved from the start of LL: " + myLinkedList.removeFirst().value);
        System.out.print("\nRemoved from the start of LL: " + myLinkedList.removeFirst().value);
        System.out.print("\nRemoved from the start of LL: " + myLinkedList.removeFirst());

    }

}
