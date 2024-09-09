package ds.prep.firstround.stack;

import java.util.EmptyStackException;

public class StackUsingArray {
    private final int[] arr;
    private int top;

    public StackUsingArray(int capacity) {
        this.top = -1;
        this.arr = new int[capacity];
    }

    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(4);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();
        System.out.println("Popping === ");
        st.pop();
        st.display();

    }

    public void push(int data) {
        if (isFull()) throw new RuntimeException("Stack is already full");
        top++;
        arr[top] = data;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        int temp = arr[top];
        arr[top] = 0;
        top--;
        return temp;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return arr.length == size();
    }

    public int size() {
        return this.top + 1;
    }

    public void display() {
        for (int i : arr) if (i != 0) System.out.println(i);
    }
}
