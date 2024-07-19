package dsprepnew.array;

public class ReverseArray {
    public static void main(String [] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int [] arr = {4,5,6,7,8,9};
        arrayUtils.reverse(arr, 0, arr.length - 1);
        arrayUtils.print(arr);
        System.out.println(arrayUtils.secondMax(arr));
    }
}
