package dsprepnew.linkedlist;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printElements(SinglyLinkedList list) {
        ListNode current = list.head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public int length() {
        if (head == null) return 0;

        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void addFirst(int data) {
        ListNode newHead = new ListNode(data);
        newHead.next = head;
        head = newHead;
    }

    public void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void add(int data, int position) {
        ListNode newNode = new ListNode(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode prev = head;
            int count = 1;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            ListNode temp = prev.next;
            prev.next = newNode;
            newNode.next = temp;
        }
    }

    public ListNode deleteFirst(int position) {
        if (head == null) return null;
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.head = new ListNode(9);
        System.out.println(list.length());

        // Adding new nodes
        ListNode l1 = new ListNode(17);
        ListNode l2 = new ListNode(5);

        list.head.next = l1;
        l1.next = l2;
        l2.next = null;
        System.out.println(list.length());

        // Adding to the first
        list.addFirst(66);
        list.printElements(list);

        // Adding to the last
        list.add(65);
        System.out.println();
        list.printElements(list);

        // Adding to an index
        list.add(44, 4);
        System.out.println();
        list.printElements(list);

        list.deleteFirst(1);
        System.out.println();
        list.printElements(list);
    }

}
