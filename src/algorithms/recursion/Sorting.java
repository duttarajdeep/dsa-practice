package algorithms.recursion;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1, 7, 8, 9, 13, 12};
        try {
            mergeSortInPlace(arr, 0, arr.length);
            System.out.println(Arrays.toString(arr));
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

    static void mergeSortInPlace(int[] arr, int s, int e) {

        // Base condition to break recursion
        if (e == s + 1) return;

        int m = (s + e) / 2;

        // Sort Left side
        mergeSortInPlace(arr, s, m);

        // Sort Right side
        mergeSortInPlace(arr, m, e);

        // Merge both side
        mergeInPlace(arr, s, m, e);

    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {

        int i = s;
        int j = m;
        int k = 0;

        // Temp array to hold the sorted part
        int[] temp = new int[e - s];

        // Iterate using 2 pointers i and j, and store the result in temp
        while (i < m && j < e) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[j++];
            } else {
                temp[k] = arr[i++];
            }
            k++;
        }

        // Check if either of the parts have finished their iteration
        // If yes, append the rest of the remaining part to the end of the other part
        while (i < m) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Finally, copy the elements from temp arr to original arr
        for (int l = 0; l < temp.length; l++) {
            arr[s + l] = temp[l];
        }
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
