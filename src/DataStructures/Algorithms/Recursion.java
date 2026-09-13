package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Recursion {

    public static int findFactorialRecursive(int num){// O(n)
        //Base Case
        if(num < 0){
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        if(num == 1 || num == 0){
            return 1;
        }
        return num * findFactorialRecursive(num-1);
    }

    public static int findFactorialIterative(int num){//O(n)
        int answer = 1;
        if(num == 2){
            answer = 2;
        }
        for (int i = 2; i <= num; i++) {
            answer = answer * i;
        }
        return answer;
    }

    public static int fibonacciIterative(int n){// O(n)
        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(0,1));

        for (int i = 2; i < n; i++) {
            arr.add(arr.get(i-1)+arr.get(i-2));
        }
        return arr.get(n);
    }

    public static int fibonacciRecursive(int n){// O(2^n)
        // Base cases
        if (n < 2) {
            return n;
        }

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    static void main(String[] args) {
        //Find Factorial
        System.out.println(findFactorialRecursive(5));
        System.out.println(findFactorialIterative(5));

        //Fibonacci
        System.out.println(fibonacciRecursive(6));
        System.out.println(fibonacciRecursive(8));
        System.out.println(fibonacciRecursive(12));
    }
}
