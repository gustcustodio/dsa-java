package com.loiane.dsa.linkedList;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    private final int NOT_FOUND = -1;
    private final String DOES_NOT_EXIST = "Posição não existe.";
    private final String EMPTY_LIST = "Lista está vazia.";

    private boolean positionDoesNotExist(int position) {
        return !(position >= 0 && position <= this.size);
    }

    public void insertAtStart(T element) {
        if (this.size == 0) {
            Node<T> newNode = new Node<>(element);
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node<T> newNode = new Node<>(element, this.head);
            this.head = newNode;
        }
        this.size++;
    }

    public void insertAtEnd(T element) {
        Node<T> newNode = new Node<>(element);
        if (this.size == 0) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
        }
        this.tail = newNode;
        this.size++;
    }

    public void insert(int index, T element) {
        if (this.positionDoesNotExist(index)) {
            throw new IllegalArgumentException(DOES_NOT_EXIST);
        }

        if (index == 0) {
            this.insertAtStart(element);
        } else if (index == this.size) {
            this.insertAtEnd(element);
        } else {
            Node<T> previousNode = this.searchNode(index - 1);
            Node<T> nextNode = previousNode.getNext();
            Node<T> newNode = new Node<>(element, nextNode);
            previousNode.setNext(newNode);
            this.size++;
        }
    }

    public T removeFromStart() {
        if (this.size == 0) {
            throw new RuntimeException(EMPTY_LIST);
        }

        T removed = this.head.getElement();
        this.head = this.head.getNext();
        this.size--;

        if (this.size == 0) {
            this.tail = null;
        }

        return removed;
    }

    public T removeFromEnd() {
        if (this.size == 0) {
            throw new RuntimeException(EMPTY_LIST);
        }
        if (this.size == 1) {
            return this.removeFromStart();
        }

        Node<T> penultimateNode = this.searchNode(this.size - 2);
        T removed = penultimateNode.getNext().getElement();
        penultimateNode.setNext(null);
        this.tail = penultimateNode;
        this.size--;

        return removed;
    }

    public T remove(int index) {
        if (this.positionDoesNotExist(index)) {
            throw new IllegalArgumentException(DOES_NOT_EXIST);
        }

        if (index == 0) {
            return this.removeFromStart();
        }
        if (index == this.size - 1) {
            return this.removeFromEnd();
        }

        Node<T> previousNode = this.searchNode(index - 1);
        Node<T> currentNode = previousNode.getNext();
        Node<T> nextNode = currentNode.getNext();

        previousNode.setNext(nextNode);
        currentNode.setNext(null);
        this.size--;

        return currentNode.getElement();
    }

    public void clear() {
        for (Node<T> currentNode = this.head; currentNode != null; ) {
            Node<T> nextNode = currentNode.getNext();
            currentNode.setElement(null);
            currentNode.setNext(null);
            currentNode = nextNode;
        }
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int search(T element) {
        int index = 0;

        for (Node<T> currentNode = this.head; currentNode != null; ) {

            if (currentNode.getElement().equals(element)) {
                return index;
            }

            index++;
            currentNode = currentNode.getNext();

        }

        return NOT_FOUND;
    }

    public T searchPosition(int index) {
        return this.searchNode(index).getElement();
    }

    private Node<T> searchNode(int index) {
        if (this.positionDoesNotExist(index)) {
            throw new IllegalArgumentException(DOES_NOT_EXIST);
        }

        Node<T> currentNode = this.head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    @SuppressWarnings("unchecked")
    public T[] transformArray() {
        if (this.size == 0) {
            return (T[]) new Object[0];
        }

        Object[] vetor = new Object[this.size];
        Node<T> currentNode = this.head;

        for (int i = 0; i < this.size; i++) {
            vetor[i] = currentNode.getElement();
            currentNode = currentNode.getNext();
        }

        return (T[]) vetor;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        if (this.size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        Node<T> currentNode = this.head;

        for (int i = 0; i < size - 1; i++) {
            builder.append(currentNode.getElement()).append(", ");
            currentNode = currentNode.getNext();
        }

        builder.append(currentNode.getElement()).append("]");

        return builder.toString();
    }
}
