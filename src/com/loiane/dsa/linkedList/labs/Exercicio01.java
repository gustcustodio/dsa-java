package com.loiane.dsa.linkedList.labs;

import com.loiane.dsa.linkedList.LinkedList;

import java.util.Arrays;

public class Exercicio01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            list.insertAtEnd(i);
        }

        System.out.println(list);

        System.out.println(Arrays.toString(transformArray(list)));

        System.out.println(Arrays.toString(list.transformArray()));
    }

    public static int[] transformArray(LinkedList<Integer> list) {
        int size = list.getSize();
        int[] vetor = new int[size];

        for (int i = 0; i < size; i++) {
            vetor[i] = list.searchPosition(i);
        }

        return vetor;
    }
}
