package ds.prep.firstround.stack;

import java.util.Stack;

public class Questions {
    public static String reverseAStringUsingStack(String str) {

        if (str.length() == 0) throw new IllegalArgumentException("Cannot reverse an empty string");

        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char c : chars) stack.push(c);

        for (int i = 0; i < chars.length; i++) chars[i] = stack.pop();

        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "rajdeep";
//        System.out.println(reverseAStringUsingStack(str));
        int[] input = {2, 4, 3, 2, 9, 5, 6};
        int[] res = nextGreaterElement(input);
//        System.out.println(Arrays.toString(res));

        String brackets = "{[{()}]}";
        System.out.println(validParenthesis(brackets));
    }

    public static int[] nextGreaterElement(int[] input) {
        int[] result = new int[input.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = input.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() < input[i]) stack.pop();
            }
            if (stack.isEmpty()) result[i] = -1;
            else result[i] = stack.peek();

            stack.push(input[i]);
        }
        return result;
    }

    public static boolean validParenthesis(String brackets) {
        Stack<Character> stack = new Stack<>();
        for (char c : brackets.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) stack.pop();
                    else return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
