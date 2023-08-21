package leetCode.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Numpad {

    public static void main(String[] args) {
        ArrayList<String> list = numpad("", "9");
        System.out.println(list);
    }

    static ArrayList<String> numpad(String p, String up) {
        // base condition
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> currentAns = new ArrayList<>(); // store the current ans for this funciton call

        int digit = up.charAt(0) - '0';

        int lowerBound = 3 * (digit - 2);
        int upperBound = 3 * (digit - 1);

        // edge case
        if (digit == 7) {
            upperBound += 1;
        }
        if (digit == 8) {
            lowerBound += 1;
            upperBound += 1;
        }
        if(digit == 9){
            lowerBound += 1;
            upperBound += 2;
        }

        for (int i = lowerBound; i < upperBound; i++) {
            char ch = (char) ('a' + i);
            currentAns.addAll(numpad(p + ch, up.substring(1)));
        }

        return currentAns;
    }

}
