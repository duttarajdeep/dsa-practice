package ds.prep.firstround.linkedlist;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "--> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        ListNode firstL1 = new ListNode(4);
        ListNode secondL1 = new ListNode(9);
        l1.next = firstL1;
        firstL1.next = secondL1;
        display(l1);

        ListNode l2 = new ListNode(5);
        ListNode firstL2 = new ListNode(6);
        l2.next = firstL2;
        display(l2);

        ListNode sum = addTwoNumbers(l1, l2);
        display(sum);
    }

    /**
     * https://leetcode.com/problems/add-two-numbers/description/
     */

    static class ListNode {
        ListNode next;
        int val;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        public ListNode(int val, ListNode next) {
            this.next = next;
            this.val = val;
        }
    }
}
