package algorithms.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2};
        List<List<Integer>> subsets = subsetsDuplicate(arr);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    // Subsets using recursive approach
    static ArrayList<String> subsets(String p, String up) {
        // Base condition
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        // take first char
        char first = up.charAt(0);

        // make recursive call for left side result ( considering first )
        ArrayList<String> left = subsets(p + first, up.substring(1));

        // make recursive call for right side result ( ignoring first )
        ArrayList<String> right = subsets(p, up.substring(1));

        // combine both arrays
        left.addAll(right);

        return left;
    }

    // Subsets using iterative approach
    static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> master = new ArrayList<>();

        master.add(new ArrayList<>());

        for (int num : arr) {
            int numberOfCurrentLists = master.size();
            for (int i = 0; i < numberOfCurrentLists; i++) {
                ArrayList<Integer> currentList = new ArrayList<>(master.get(i));
                currentList.add(num);
                master.add(currentList);
            }
        }
        return master;
    }

    static List<List<Integer>> subsetsDuplicate(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());

        int start;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = answer.size() - 1;
            int n = answer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(answer.get(i));
                internal.add(arr[i]);
                answer.add(internal);
            }
        }
        return answer;
    }
}
