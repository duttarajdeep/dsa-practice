package ds.prep.firstround.queue;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(10);
        queue.print();

//        queue.dequeue();
        queue.dequeue();
        queue.print();

        System.out.println(queue.first());
        System.out.println(queue.last());
    }

    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public ListNode dequeue() {
        if (isEmpty()) throw new IllegalArgumentException("Queue is already empty");
        ListNode temp = front;
        front = front.next;
        if (front == null) rear = null;
        temp.next = null;
        length--;
        return temp;
    }

    public int first() {
        if (isEmpty()) throw new IllegalArgumentException("Queue is already empty");
        return front.data;
    }

    public int last() {
        if (isEmpty()) throw new IllegalArgumentException("Queue is already empty");
        return rear.data;
    }

    public int length() {
        return this.length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void print() {
        if (isEmpty()) {
        }
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
