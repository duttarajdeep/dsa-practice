package ds.prep.firstround.linkedlist;

import ds.prep.revision.first.linkedlist.SinglyLinkedList;

public class SwapNumbers {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        sll.insert(4);
        sll.display();
        sll.swap();
        sll.display();
    }


}
