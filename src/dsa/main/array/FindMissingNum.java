package dsa.main.array;

public class FindMissingNum {

    static int missingNum(int[] arr) {
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        for (int num : arr) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        System.out.println(missingNum(arr));
    }

}
