package ds.prep.firstround.linkedlist;

public class SinglyLinkedList {

    private ListNode head;

    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static ListNode mergeSortedList(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
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
        return dummy.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList listA = new SinglyLinkedList();

        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(35);
        ListNode fifth = new ListNode(45);
        ListNode sixth = new ListNode(55);
        ListNode seventh = new ListNode(65);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        listA.head = head;

        display(head);

//        ListNode reversedHead = list.reverse(head);
//
//        list.display(reversedHead);

//        System.out.println(list.mid(head).data);

//        System.out.println(list.findByPosition(head, 3).data);
//        System.out.println(list.findByPosition(head, 6).data);

//        System.out.println("Nth: node from end is: " + list.findNthNodeFromEnd(head, 2).data);

//        list.removeDuplicate(head);
//        list.display(head);

//        head = list.addToSortedList(head, new ListNode(-1));
//        list.display(head);

//        list.removeKey(head, 10);
//
//        list.display(head);

//        ListNode loopStartingPos = list.getLoopStartingPosition(head);
//        System.out.println(loopStartingPos.data);

//        System.out.println("Loop status: " + listA.detectLoop(head));
//        listA.removeLoop(head);
//        System.out.println("Loop status: " + listA.detectLoop(head));
//        listA.display(head);

        SinglyLinkedList listB = new SinglyLinkedList();
        ListNode headB = new ListNode(11);
        ListNode firstB = new ListNode(21);
        ListNode secondB = new ListNode(31);
        ListNode thirdB = new ListNode(41);
        ListNode fourthB = new ListNode(51);

        headB.next = firstB;
        firstB.next = secondB;
        secondB.next = thirdB;
        thirdB.next = fourthB;

        display(headB);

        ListNode mergedHead = mergeSortedList(head, headB);

        display(mergedHead);
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

    public ListNode deleteFirst() {
        if (head == null) return null;
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public ListNode delete(int position) {
        if (position == 1) {
            head = head.next;
        }
        int counter = 1;
        ListNode prev = head;

        while (counter < position - 1) {
            prev = prev.next;
            counter++;
        }
        ListNode current = prev.next;
        prev.next = current.next;
        current.next = null;
        return current;
    }

    public boolean find(ListNode head, int data) {
        if (head == null) return false;

        ListNode current = head;
        while (current.next != null) {
            if (current.data == data) return true;
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public ListNode mid(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public ListNode findByPosition(ListNode head, int n) {
        if (head == null) {
            throw new IllegalArgumentException("The head of the linkedlist cannot be null");
        }
        if (n == 1) return head;
        int count = 1;
        ListNode current = head;
        while (current != null) {
            if (count == n) return current;
            count++;
            current = current.next;
        }
        return null;
    }

    public void removeDuplicate(ListNode head) {
        if (head == null) throw new IllegalArgumentException("Cannot sort an empty list");
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public ListNode findNthNodeFromEnd(ListNode head, int n) {
        if (head == null) return null;

        if (n <= 0) throw new IllegalArgumentException("Invalid value of n: " + n);

        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n) {
            if (refPtr == null)
                throw new IllegalArgumentException("The value of n: " + n + " is greater that the list size");
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }
        return mainPtr;
    }

    public ListNode addToSortedList(ListNode head, ListNode newNode) {
        if (newNode.data < head.data) {
            newNode.next = head;
            return newNode;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current != null && current.data < newNode.data) {
            previous = current;
            current = current.next;
        }
        newNode.next = current;
        previous.next = newNode;
        return head;
    }

    public void removeKey(ListNode head, int key) {
        if (head == null) throw new IllegalArgumentException("Cannot remove key from empty list");
        ListNode current = head;
        ListNode previous = head;

        if (current.data == key) {
            head = current.next;
            return;
        }

        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
        if (current == null) return;
        previous.next = current.next;
        current.next = null;

    }

    public boolean detectLoop(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) return true;
        }
        return false;
    }

    public ListNode getLoopStartingPosition(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    // Lloyd's cycle detection algorithm
    public ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;
        while (slowPtr != temp) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    public void removeLoop(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                removeLoopElement(slowPtr);
            }
        }
    }

    public void removeLoopElement(ListNode slowPtr) {
        ListNode temp = head;
        while (slowPtr.next != temp.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    private static class ListNode {
        private final int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
