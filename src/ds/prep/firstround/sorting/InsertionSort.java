package ds.prep.firstround.sorting;

public class InsertionSort {
    public void sort(int[] nums) {
        // start from index 1, considering that the first element would be automatically sorted
        for (int i = 1; i < nums.length; i++) {
            // this point is the divider, left side is the sorted part and right side is the unsorted part
            // store the 1st element of the unsorted part, in a temp var, this creates a hole in the array
            int temp = nums[i];

            // the j pointer is used to iterate through the sorted part, initialize the j part to be 1 less than i
            int j = i - 1;

            // run while loop till the j becomes 0, i.e we reach to the 1st element of sorted part
            // and the current element in the sorted part is > temp, because all elements to the left would be
            // automatically < temp, so this would be the right place to insert the temp var
            // while these conditions are true, we keep on shifting each element to 1 place right, so as to make
            // place to insert the temp. We also keep on decreasing j by 1
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }
            // finally, j + 1 is the correct position to insert the temp var in the sorted part
            nums[j + 1] = temp;
        }
    }
}
