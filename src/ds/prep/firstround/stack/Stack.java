package ds.prep.firstround.stack;

import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;

    public Stack() {
        this.top = null;
        this.length = 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.display();

        stack.pop();
        stack.pop();

        stack.display();

        System.out.println(stack.peak());


    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peak() {
        if (isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void display() {
        ListNode current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    private class ListNode {
        private final int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
