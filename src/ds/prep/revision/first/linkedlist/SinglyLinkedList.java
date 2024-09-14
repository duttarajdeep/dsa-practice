package ds.prep.revision.first.linkedlist;

public class SinglyLinkedList {
    private ListNode head;

    public void swap() {
        if (this.head == null || head.next == null) {
            return;
        }
        ListNode newHead = head.next;

        ListNode prev = null;
        ListNode current = head;

        while (current != null && current.next != null) {
            ListNode nextPair = current.next.next;
            ListNode second = current.next;

            second.next = current;
            current.next = nextPair;

            if (prev != null) {
                prev.next = second;
            }
            prev = current;
            current = nextPair;
        }

        this.head = newHead;
    }

    // Generic linked list utilities
    public void init(int data) {
        head = new ListNode(data);
    }

    public ListNode getHead() {
        return this.head;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
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

    public ListNode reverse() {
        ListNode current = head;
        ListNode prev = null;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public int mid() {
        if (head == null) throw new IllegalArgumentException("List is empty");

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr.data;
    }

    public void removeDuplicates() {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    // Insertion methods
    public void insert(int data) {
        ListNode temp = new ListNode(data);
        if (head == null) {
            head = temp;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = temp;
    }

    public void insert(int data, int position) {
        if (head == null)
            throw new IllegalArgumentException("Linkedlist is not initialised");
        if (position > length())
            throw new IllegalArgumentException("Element can't be inserted at a position greater that the current length");

        ListNode current = head;
        ListNode previous = null;
        int count = 1;

        while (current != null && count < position) {
            previous = current;
            current = current.next;
            count++;
        }

        ListNode temp = new ListNode(data);
        previous.next = temp;
        temp.next = current;

    }

    public void insertFirst(int data) {
        if (head == null)
            head = new ListNode(data);

        ListNode n = new ListNode(data);
        n.next = head;
        head = n;
    }

    public void insertToSortedList(int data) {
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        ListNode prev = null;
        while (current != null && current.data < data) {
            prev = current;
            current = current.next;
        }
        prev.next = newNode;
        newNode.next = current;
    }

    // Deletion methods
    public int deleteFirst() {
        if (head == null) throw new IllegalArgumentException("List is empty");
        ListNode temp = head;
        head = temp.next;
        return temp.data;
    }

    public int deleteLast() {
        if (head == null) throw new IllegalArgumentException("List is empty");
        ListNode current = head;
        ListNode prev = null;
        int count = 0;
        while (current.next != null) {
            prev = current;
            current = current.next;
            count++;
        }
        prev.next = null;
        return current.data;
    }

    public int delete(int position) {
        if (head == null) throw new IllegalArgumentException("List is empty");
        if (position > length()) throw new IllegalArgumentException("Invalid position value > length of list");
        ListNode current = head;
        ListNode prev = null;
        int count = 1;

        while (current.next != null && count < position) {
            prev = current;
            current = current.next;
            count++;
        }
        ListNode temp = current;
        prev.next = temp.next;
        current.next = null;
        return temp.data;
    }

    public int deleteKey(int key) {
        if (head != null && head.data == key) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return temp.data;
        }
        ListNode current = head;
        ListNode prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        if (current.data == key) {
            prev.next = current.next;
            current.next = null;
            return current.data;
        }
        return -1;
    }

    // Search methods
    public boolean find(int data) {
        if (head == null) throw new IllegalArgumentException("List is empty");

        ListNode current = head;
        while (current != null) {
            if (current.data == data) return true;
            current = current.next;
        }
        return false;
    }

    public int findNthNodeFromEnd(int n) {
        if (head == null) throw new RuntimeException("List is empty");
        int length = length();
        if (n > length) throw new IllegalArgumentException("Value of n cant be greater than length of the list");
        int count = 1;
        ListNode current = head;
        while (current != null && count <= length - n) {
            current = current.next;
            count++;
        }
        return current.data;
    }

    public int findNthNode(int n) {
        if (head == null) throw new RuntimeException("List is empty");

        if (n == 1)
            return head.data;

        int length = length();
        if (n > length) throw new IllegalArgumentException("Value of n cant be greater than length of the list");
        int count = 1;
        ListNode current = head;

        while (count < n) {
            current = current.next;
            count++;
        }
        return current.data;
    }

    // Cycle detection methods
    public boolean hasLoop() {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) return true;
        }
        return false;
    }

    public void initListWithLoop() {
        init(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = fifth;
    }

    public int getLoopStartingNodeData() {
        ListNode loopStart = getLoopStartingNode();
        return loopStart.data;
    }

    private ListNode getLoopStartingNode() {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    private ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;
        while (temp != slowPtr) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    public void removeLoop() {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                removeLoopByPos(slowPtr);
            }
        }
    }


    // Related questions

    private void removeLoopByPos(ListNode slowPtr) {
        ListNode temp = head;
        while (temp.next != slowPtr.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    public void mergeTwoSortedLists(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.data < b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        head = dummy.next;
        display();
    }

    public void addTwoNumbers(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (a != null && b != null) {
            int x = a != null ? a.data : 0;
            int y = b != null ? b.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            if (a != null) a = a.next;
            if (b != null) b = b.next;
            tail = tail.next;
        }
        if (carry > 0)
            tail.next = new ListNode(carry);

        // for display
        head = dummy.next;
        display();
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
