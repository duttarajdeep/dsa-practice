package ds.prep.firstround.linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;


    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(9);
        list.insertLast(10);

        list.displayForward();
        list.deleteFirst();
        list.displayForward();
        list.deleteLast();
        list.displayForward();
        list.deleteLast();
        list.displayForward();
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int getLength() {
        return this.length;
    }

    public void displayForward() {
        if (head == null) return;
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        if (tail == null) return;
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertLast(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;

        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public ListNode deleteFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public ListNode deleteLast() {
        if (isEmpty()) throw new NoSuchElementException();
        ListNode temp = tail;
        if (head == tail) head = null;
        else temp.previous.next = null;
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    private class ListNode {
        private final int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

}
