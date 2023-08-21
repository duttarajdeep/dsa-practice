package leetCode.Recursion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceRet("", 4));
    }

    static void dice(String ans, int input) {
        if (input == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 1; i <= 6 && i <= input; i++) {
            dice(ans + i, input - i);
        }
    }

    static ArrayList<String> diceRet(String ans, int input) {
        if (input == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> currentAns = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= input; i++) {
            currentAns.addAll(diceRet(ans + i, input - i));
        }
        return currentAns;
    }
}
