package com.scott.dsa.doublylinkedlists;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        /*
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        */

        myDLL.append(5);

        /*
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast());
        */

        /*
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst());
        */

        myDLL.prepend(3);
        myDLL.prepend(4);
        myDLL.prepend(5);

        /*
        System.out.println(myDLL.get(1).value);
        System.out.println(myDLL.get(3).value);
         */

        /*
        System.out.println(myDLL.set(1, 8));
        System.out.println(myDLL.set(10, 8));
        */

        myDLL.insert(2, 20);

        myDLL.remove(2);

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();

    }

}
