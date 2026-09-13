package Algorithms.Sorting;

public class Merge_Sort {

    public static void mergeSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            array[left + x] = temp[x];
        }
    }

    static void main(String[] args) {
        int[] numsIterator = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        mergeSort(numsIterator,0, numsIterator.length-1);

        for (int i = 0; i < numsIterator.length; i++) {
            System.out.println(numsIterator[i]);
        }
    }
}
