package algorithms.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class StringProblems {

    public static void main(String[] args) {
        // System.out.println(removeCharFromString("rajdaaaaeepa", 'a'));
        // System.out.println(removeStringFromString("rajdeep", "de"));
        // subSequence("", "abc");
        // System.out.println(subsets("", "abc"));

    }

    static String removeCharFromString(String s, char c) {

        if (s.length() == 0) return s;

        char ch = s.charAt(0);

        if (ch == c) {
            return removeCharFromString(s.substring(1), c);
        } else {
            return ch + removeCharFromString(s.substring(1), c);
        }

    }

    static String removeStringFromString(String original, String toBeRemoved) {
        if (original.length() == 0) {
            return original;
        }

        if (original.startsWith(toBeRemoved)) {
            return removeStringFromString(original.substring(toBeRemoved.length()), toBeRemoved);
        } else {
            return original.charAt(0) + removeStringFromString(original.substring(1), toBeRemoved);
        }
    }

}
