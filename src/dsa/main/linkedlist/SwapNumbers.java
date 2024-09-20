package dsa.main.linkedlist;

import dsa.revision.first.linkedlist.SinglyLinkedList;

public class SwapNumbers {
    public static void main(String[] args) {
        dsa.revision.first.linkedlist.SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        sll.insert(4);
        sll.display();
        sll.swap();
        sll.display();
    }


}
