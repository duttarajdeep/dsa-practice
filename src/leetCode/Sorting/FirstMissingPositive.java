package leetCode.Sorting;

class FirstMissingPositive {

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        // sort the array, while sorting, ignore elements < 1
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // iterate through the array and return index + 1 when we encounter nums[i] != i + 1
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                return j + 1;
            }
        }

        // if execution reached here, means array is sorted and all elements are at the correct place.
        // So the smallest missing positive integer would be length of array + 1
        return nums.length + 1;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}