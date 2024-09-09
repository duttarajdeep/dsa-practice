package ds.prep.firstround.array;

public class FindMinInArray {

    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 7, 9, 4};
        FindMinInArray fm = new FindMinInArray();
        System.out.println(fm.findMinimum(nums));
    }

    private int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException(("Input array cant be empty"));
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

}
