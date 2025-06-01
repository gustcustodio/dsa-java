package linkedList.test;

import linkedList.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // initialTests();
        // addFront();
        // addPosition();
        // removeFromStart();
        // removeFromEnd();
        remove();
    }

    public static void remove() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        System.out.println(list);
        System.out.println("Elemento removido: " + list.remove(4));
        System.out.println(list);
        System.out.println("Elemento removido: " + list.remove(1));
        System.out.println(list);
    }

    public static void removeFromEnd() {
        LinkedList<Integer> list = new LinkedList<>();

        // list.removeFromEnd();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        System.out.println("Lista: " + list);
        System.out.println("Elemento removido: " + list.removeFromEnd());
        System.out.println("Lista: " + list);
        System.out.println("Elemento removido: " + list.removeFromEnd());
        System.out.println("Lista: " + list);
        System.out.println("Elemento removido: " + list.removeFromEnd());
        System.out.println("Lista: " + list);
    }

    public static void removeFromStart() {
        LinkedList<Integer> list = new LinkedList<>();

        // list.removeFromStart();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        System.out.println("Lista: " + list);
        System.out.println("Elemento removido: " + list.removeFromStart());
        System.out.println("Lista: " + list);
        System.out.println("Elemento removido: " + list.removeFromStart());
        System.out.println("Lista: " + list);
        System.out.println("Elemento removido: " + list.removeFromStart());
        System.out.println("Lista: " + list);
    }

    public static void addPosition() {
        LinkedList<Integer> list = new LinkedList<>();

        // list.insert(-1, 1);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        // list.insert(5, 0);
        list.insert(2, 3);
        list.insert(4, 5);
        list.insert(0, 0);


        System.out.println(list);
        System.out.println(list.getSize());
    }

    public static void addFront() {
        LinkedList<Integer> list = new LinkedList<>();

        list.insertAtStart(3);
        list.insertAtStart(2);
        list.insertAtStart(1); // 1, 2, 3

        System.out.println(list);
    }

    public static void initialTests() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        System.out.println("Tamanho = " + list.getSize());
        System.out.println(list);

        // list.clear();
        // System.out.println(list);

        System.out.println("***** busca por elemento, retornando o index *****");
        System.out.println(list.search(1));
        System.out.println(list.search(2));
        System.out.println(list.search(3));
        System.out.println(list.search(4));

        System.out.println("***** busca por index, retornando o elemento *****");
        System.out.println(list.searchPosition(0));
        System.out.println(list.searchPosition(1));
        System.out.println(list.searchPosition(2));
        // System.out.println(list.searchPosition(-1));
        // System.out.println(list.searchPosition(4));
    }
}
