package leetcode.java.sept22;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String brackets = "(()";
        System.out.println(isValidBracket(brackets));
    }

    public static boolean isValidBracket(String brackets) {
        if (brackets.length() == 0 || brackets.length() == 1)
            return false;
        Stack<Character> stack = new Stack<>();
        for (char c : brackets.toCharArray()) {
            if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (c == '(')
                stack.push(')');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

}
