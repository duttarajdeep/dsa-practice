package dsa.main.sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10, 14, 19};
        System.out.println(Arrays.toString(solution(a, b, 5, 7)));
    }

    private static int[] solution(int[] a, int[] b, int n, int m) {
        int[] result = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            result[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = a[j];
            j++;
            k++;
        }
        return result;
    }
}
