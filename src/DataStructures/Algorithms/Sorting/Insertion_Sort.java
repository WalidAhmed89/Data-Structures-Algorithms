package Algorithms.Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i-1;

            while(j >= 0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    static void main(String[] args) {
        int[] numsIterator = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        insertionSort(numsIterator);

        Arrays.stream(numsIterator).forEach(num -> {
            System.out.println(num);
        });
    }
}
