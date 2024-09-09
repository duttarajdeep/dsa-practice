package ds.prep.firstround.array;

public class MoveAllZeroesToEnd {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] arr = {0, 4, 0, 0, 9, 0};

        arrayUtils.print(arr);

        moveZeroes(arr);

        arrayUtils.print(arr);
    }

    public static void moveZeroes(int[] arr) {
        if (arr.length == 0) throw new Error("Cannot perform operation on an empty array");

        int j = 0; // focus on zeroth elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) j++;
        }
    }


}
