package algorithms;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        /*
         * Cyclic sort is applicable only for arrays having numbers in the rang 1 to n,
         * where 'n' is the length of the array
         * */
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - i != 1) {
                swap(arr, i, arr[i] - 1);
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}