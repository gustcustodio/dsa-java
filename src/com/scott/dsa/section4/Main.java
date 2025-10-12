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

        System.out.print("\n***** GET METHOD *****");
        System.out.print("\n" + myLinkedList.get(2).value);

        System.out.print("\n***** SET METHOD *****");
        System.out.println("\n" + myLinkedList.set(2, 9));
        myLinkedList.printList();

        System.out.print("\n***** INSERT METHOD *****");
        System.out.println("\n" + myLinkedList.insert(4, 20));
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
