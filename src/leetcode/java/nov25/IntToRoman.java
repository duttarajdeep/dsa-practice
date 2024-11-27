package leetcode.java.nov25;

public class IntToRoman {
    public static void main(String[] args) {
        int i = 3759;
        System.out.println(intToRoman(i));
    }

    /**
     * I	1
     * IV   4
     * V	5
     * IX   9
     * X	10
     * XL   40
     * L	50
     * XC   90
     * C	100
     * CD   400
     * D	500
     * CM   900
     * M	1000
     */
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] keys = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            for (int i = 0; i < values.length; i++) {
                int noOfLetters = num / values[i];
                if (noOfLetters != 0) {
                    String currentLetters = buildRomanNumber(noOfLetters, keys[i]);
                    sb.append(currentLetters);
                    num = num % values[i];
                }
            }
        }
        return sb.toString();
    }

    private static String buildRomanNumber(int noOfLetters, String letter) {
        StringBuilder sb = new StringBuilder();
        while (noOfLetters > 0) {
            sb.append(letter);
            noOfLetters--;
        }
        return sb.toString();
    }
}
