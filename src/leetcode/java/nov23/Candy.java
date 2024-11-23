package leetcode.java.nov23;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        int[] nums = {1, 2, 87, 87, 87, 2, 1};
        System.out.println(candy(nums));
    }

    public static int candy(int[] ratings) {
        if (ratings.length == 0) throw new IllegalArgumentException("Ratings cannot be empty");
        int[] candy = new int[ratings.length];
        Arrays.fill(candy, 1);
        for (int i = 0; i < ratings.length - 1; i++) {
            if (ratings[i] < ratings[i + 1]) candy[i + 1] = candy[i] + 1;
        }
        for (int i = ratings.length - 1; i >= 1; i--) {
            if (ratings[i] < ratings[i - 1]) candy[i - 1] = Math.max(candy[i] + 1, candy[i - 1]);
        }
        int total = 0;
        for (int i = 0; i < candy.length; i++) {
            total += candy[i];
        }
        return total;
    }
}
