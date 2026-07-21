package Algorithms.Sorting;

import java.util.Arrays;

public class Selection_Sort {
    //Selection Sort using Iterator(Loop)
    public static void selectionSort_Iterator(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }

    //Selection Sort using Recursion
    public static void selectionSort_Recursion(int[] array) {
        selectionSort_Recursion(array, 0);
    }

    public static void selectionSort_Recursion(int[] array, int start) {
        if (start >= array.length - 1) return;

        int smallestIndex = start;

        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        int temp = array[start];
        array[start] = array[smallestIndex];
        array[smallestIndex] = temp;

        selectionSort_Recursion(array, start + 1);
    }

    static void main(String[] args) {
        int[] numsIterator = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] numsRecursion = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        selectionSort_Iterator(numsIterator);
        selectionSort_Recursion(numsRecursion);

        Arrays.stream(numsIterator).forEach(num -> {
            System.out.println(num);
        });
        System.out.println("--------------------------");
        Arrays.stream(numsRecursion).forEach(num -> {
            System.out.println(num);
        });
    }
}
