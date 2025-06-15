package com.loiane.dsa.linkedList.labs;

import com.loiane.dsa.linkedList.LinkedList;

public class Exercicio02 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            list.insertAtEnd("" + i);
        }

        System.out.println(list);

        list.reverse();

        System.out.println(list);
    }
}
