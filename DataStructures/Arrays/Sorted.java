package Arrays;

import java.util.Arrays;

public class Sorted {
    public static int[] margeSorted(int[] arr1, int[] arr2){
        int [] result = new int[arr1.length+ arr2.length];

        int i = 0;
        int j = 0;
        int resultIndex = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                result[resultIndex] = arr1[i];
                i++;
            }else{
                result[resultIndex] = arr2[j];
                j++;
            }
            resultIndex++;
        }

        while(i < arr1.length){
            result[resultIndex] = arr1[i];
            i++;
            resultIndex++;
        }
        while(j < arr2.length){
            result[resultIndex] = arr2[j];
            j++;
            resultIndex++;
        }

        return result;
    }

    static void main(String[] args) {
        int[] num1 = {1, 2, 4, 6, 8};
        int[] num2 = {3, 5, 7, 9, 10};

        int[] result = margeSorted(num1, num2);

        System.out.println(Arrays.toString(result));
    }
}
