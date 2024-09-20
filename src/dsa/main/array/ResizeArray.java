package dsa.main.array;

public class ResizeArray {
    static int[] resize(int[] arr) {
        int[] temp = new int[arr.length * 2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr.length);
        arr = resize(arr);
        System.out.println(arr.length);
        arr[5] = 5;
        System.out.println(arr.length);
    }
}
