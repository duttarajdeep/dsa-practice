package algorithms.recursion;

import java.util.ArrayList;

public class SubSets {

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
}
