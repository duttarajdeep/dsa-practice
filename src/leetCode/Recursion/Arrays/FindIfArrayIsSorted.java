package leetCode.Recursion.Arrays;

public class FindIfArrayIsSorted {

    public static void main(String[] args) {
        System.out.println(checkSorted(new int []{1,2,4,3,5}));
    }

    static boolean checkSorted(int[] arr){
        int start = 0;
        int end = start + 1;
        return findIfAsc(arr, start, end);
    }

    static boolean findIfAsc(int[] arr, int s, int e){
        if(s == arr.length - 1){
            return true;
        }
        if(arr[s] > arr[e]){
            return false;
        }
        return findIfAsc(arr, ++s, ++e);
    }

}
