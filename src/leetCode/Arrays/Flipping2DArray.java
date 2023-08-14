package leetCode.Arrays;

import java.util.Arrays;

public class Flipping2DArray {

    static int[][] flipAndInvertImage(int[][] image) {
        int cols = image[0].length;
        for (int[] row : image) {
            int start = 0;
            int end = cols - 1;
            while (start <= end) {
                invertAndswap(row, start, end);
                start++;
                end--;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        flipAndInvertImage(image);
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void invertAndswap(int[] arr, int posA, int posB) {
        // invert the element
        int temp = arr[posA] ^ 1;
        arr[posA] = arr[posB] ^ 1;
        arr[posB] = temp;
    }

}
