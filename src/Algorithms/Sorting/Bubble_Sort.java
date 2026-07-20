package Algorithms.Sorting;

import java.util.Arrays;

public class Bubble_Sort {

    //Bubble Sort using Iterator(Loop)
    public static void bubbleSort_Iterator(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    //Bubble Sort using Recursion
    public static void bubbleSort_Recursion(int[] array,int n){
        if(n <= 1)return;

        for (int i = 0; i < n - 1; i++) {
            if(array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        bubbleSort_Recursion(array,n-1);
    }

    static void main(String[] args) {
        int[] numsIterator = {99,44,6,2,1,5,63,87,283,4,0};
        int[] numsRecursion = {99,44,6,2,1,5,63,87,283,4,0};

        bubbleSort_Iterator(numsIterator);
        bubbleSort_Recursion(numsRecursion,numsRecursion.length);

        Arrays.stream(numsIterator).forEach(num ->{
            System.out.println(num);
        });
        System.out.println("----------------------------------");
        Arrays.stream(numsRecursion).forEach(num ->{
            System.out.println(num);
        });
    }
}
