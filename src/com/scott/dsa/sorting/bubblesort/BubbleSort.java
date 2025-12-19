package com.scott.dsa.sorting.bubblesort;

public class BubbleSort {

    static void bubbleSort(int array[]) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped = false) break;
        }
    }

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {64, 34, 25, 12, 22, 11, 90, 80, 43, 56, 38, 75};
        bubbleSort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }

}
