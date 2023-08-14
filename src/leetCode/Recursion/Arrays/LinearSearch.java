package leetCode.Recursion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 7, 2, 7, 2, -1, -1};
//        System.out.println(search(arr, 0, 8));
        System.out.println(searchAndReturnAllOccurenceWithoutArgs(arr, 0, -1));
    }

    static int search(int[] arr, int pos, int target) {
        if (arr[pos] == target) {
            return pos;
        }
        if (pos == arr.length - 1) {
            return -1;
        }
        return search(arr, ++pos, target);
    }

    static List<Integer> searchAndReturnAllOccurence(int[] arr, int pos, int target, List<Integer> occurences) {
        if (arr[pos] == target) {
            occurences.add(pos);
        }
        if (pos == arr.length - 1) {
            if (occurences.size() == 0) {
                occurences.add(-1);
            }
            return occurences;
        }
        return searchAndReturnAllOccurence(arr, ++pos, target, occurences);
    }

    static List<Integer> searchAndReturnAllOccurenceWithoutArgs(int[] arr, int pos, int target) {
        List<Integer> occurences = new ArrayList<>();
        if (arr[pos] == target) {
            occurences.add(pos);
        }
        if (pos == arr.length - 1) {
            if (occurences.size() == 0) {
                occurences.add(-1);
            }
            return occurences;
        }
        occurences.addAll(searchAndReturnAllOccurenceWithoutArgs(arr, ++pos, target));
        return occurences;
    }

}
