package dsa.main.linkedlist;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularLinkedList();
        csll.insertFirst(55);
        csll.insertFirst(66);
        csll.insertFirst(77);
        csll.insertLast(99);
        csll.display();
        csll.removeFirst();
        csll.display();
        csll.removeLast();
        csll.display();
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
        length += 4;
    }

    public void display() {
        if (last == null) return;
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (last == null) last = newNode;
        else newNode.next = last.next;

        last.next = newNode;
        length++;
    }

    public void insertLast(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public ListNode removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        ListNode temp = last.next;
        if (temp == last) last = null;
        else last.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public ListNode removeLast() {
        ListNode current = last.next;
        ListNode previous = null;
        ListNode first = last.next;

        while (current != last) {
            previous = current;
            current = current.next;
        }

        previous.next = first;
        current.next = null;
        last = previous;

        return current;
    }

    private class ListNode {
        private final int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
}
