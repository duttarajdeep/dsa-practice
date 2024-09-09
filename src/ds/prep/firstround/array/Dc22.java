package ds.prep.firstround.array;

public class Dc22 {

    static int[] removeEven(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[count] = nums[i];
                count++;
            }
        }
        return result;
    }

    static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 9, 11};
        printArray(removeEven(nums));
    }

}
