package leetcode.java.sept25;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> in;
    Stack<Integer> out;

    public QueueUsingStack() {
        in = new Stack<Integer>();
        out = new Stack<Integer>();
    }

    public void push(int i) {
        in.push(i);
    }

    public int pop() {
        if (out.empty()) {
            while (!in.empty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public boolean empty() {
        return in.empty() && out.empty();
    }

    public int peek() {
        if (out.empty()) {
            while (!in.empty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }
}
