package leetCode.questions;

import java.util.Arrays;

// Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

// To flip an image horizontally means that each row of the image is reversed.
// For example, flipping [1,1,0] horizontally results in [0,1,1].

// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
// For example, inverting [0,1,1] results in [1,0,0].

// Input: image = [[1,1,0],[1,0,1],[0,0,0]]
// Output: [[1,0,0],[0,1,0],[1,1,1]]

// Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
// Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0 ]]

public class LeetCode832 {
    public static void main(String[] args) {
        int[][] image = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };
        int[][] result = flipAndInvertImage(image);
        for (int[] subArr : result) {
            System.out.println(Arrays.toString(subArr));
            System.out.println();
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        // for flipping, we will take two pointer approach
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if ((image[i].length - 1 - j) > j) {
                    swap(image[i], j, image[i].length - 1 - j);
                }
            }
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else if (image[i][j] == 1) {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }

    static void swap(int[] arr, int posA, int posB) {
        int temp = arr[posA];
        arr[posA] = arr[posB];
        arr[posB] = temp;
    }
}
