package algorithms.recursion;

public class Recursion {

    public static void main(String[] args) {
//        System.out.println(fibo(6));
        int [] nums = {3,5,6,8,9,1,0,4,7};
        System.out.println(binarySearch(nums, 8, 0, nums.length - 1));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static int binarySearch(int [] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }
        if(arr[m] > target){
            return binarySearch(arr, target, s, m-1);
        } else {
            return binarySearch(arr, target, m + 1, e);
        }

    }

}
