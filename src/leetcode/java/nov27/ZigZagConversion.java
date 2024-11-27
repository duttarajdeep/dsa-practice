package leetcode.java.nov27;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(zigZagConverter(s, 4));
    }

    public static String zigZagConverter(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        if (s.length() == 0 || numRows == 0) throw new IllegalArgumentException("Input arguments invalid");
        if (s.length() == 1 || numRows == 1) return s;

        int i = 0, j = 0, k = 0;

        char[][] chars = new char[numRows][s.length() / 2 + 1];
        boolean isDownward = true;

        while (k < s.length() && i < chars.length && j < chars[0].length) {
            chars[i][j] = s.charAt(k);
            if (isDownward) {
                i++;
            } else {
                i--;
                j++;
            }
            if (i == 0) isDownward = true;
            if (i == chars.length - 1) {
                isDownward = false;
            }
            k++;
        }

        for (int r = 0; r < chars.length; r++) {
            for (int c = 0; c < chars[0].length; c++) {
                char ch = chars[r][c];
                if (ch != 0) sb.append(ch);
            }
        }
        return sb.toString();
    }
}
