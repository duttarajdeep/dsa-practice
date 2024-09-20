package dsa.revision.first.linkedlist;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll1.init(2);
        sll1.insert(4);
        sll1.insert(6);
        sll1.insert(8);

        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.init(1);
        sll2.insert(3);
        sll2.insert(5);
        sll2.insert(7);

//        sll1.mergeTwoSortedLists(sll1.getHead(), sll2.getHead());
        sll1.addTwoNumbers(sll1.getHead(), sll2.getHead());
    }
}
