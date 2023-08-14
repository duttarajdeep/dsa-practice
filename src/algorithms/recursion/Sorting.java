package algorithms.recursion;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1, 7, 8, 9, 13, 12};
        try {
            System.out.println(Arrays.toString(mergeSort(arr)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void bubbleSort(int[] arr, int r, int c) {
        if (r == 0) return;

        if (r > c) {
            if (arr[c] > arr[c + 1]) swap(arr, c, c + 1);
            bubbleSort(arr, r, c + 1);
        } else {
            bubbleSort(arr, r - 1, 0);
        }
    }

    static void selectionSort(int[] arr, int p) throws Exception {
        if (p == 0) return;

        if (p > arr.length - 1) {
            throw new Exception("Position out of bound");
        }

        int maxPos = findMaxPos(arr, p);

        if (arr[maxPos] != arr[p]) {
            swap(arr, maxPos, p);
        }

        selectionSort(arr, p - 1);
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int findMaxPos(int[] arr, int p) {
        int max = -1;
        for (int i = 0; i <= p; i++) {
            if (arr[i] > max) max = i;
        }
        return max;
    }

    private static void swap(int[] arr, int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        // If one of the arrays is complete, then append the remaining elements of the second array to the
        // end of the mix array
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;

    }

}
