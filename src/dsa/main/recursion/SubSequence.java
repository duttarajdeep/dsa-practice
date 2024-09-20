package dsa.main.recursion;

public class SubSequence {
    static void subSequence(String p, String up) {

        // Base condition
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // Take 1st char
        char first = up.charAt(0);

        // Consider it for sub sequence
        subSequence(p + first, up.substring(1));

        // Ignore it for sub sequence
        subSequence(p, up.substring(1));

    }
}
