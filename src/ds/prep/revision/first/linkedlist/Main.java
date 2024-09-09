package ds.prep.revision.first.linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList sll2 = new SinglyLinkedList();
        try {
            //llRevision(sll);
            loopRevision(sll2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void loopRevision(SinglyLinkedList sll) {
        sll.initListWithLoop();
        System.out.println("Loop detected? : " + sll.hasLoop());
        System.out.println("Loop detected at node with data: " + sll.getLoopStartingNodeData());
        sll.removeLoop();
        System.out.println("Loop detected after removal ? : " + sll.hasLoop());

    }

    private static void llRevision(SinglyLinkedList sll) {
        sll.init(5);
        sll.insert(1);
        sll.insert(7);
        sll.insertFirst(2);
        sll.insertFirst(8);
        sll.insert(9);
        sll.insert(4, 4);
        sll.display();
        System.out.println("Deleted element: " + sll.deleteFirst());
        sll.display();
        System.out.println("Deleted element: " + sll.deleteLast());
        sll.display();
        System.out.println("Deleted element: " + sll.delete(4) + " from position 4");
        sll.display();
        System.out.println("Searching for 5. Found: " + sll.find(5));
        System.out.println("Searching for 6. Found: " + sll.find(6));
        System.out.println("Find 2nd node from end: " + sll.findNthNodeFromEnd(2));
        System.out.println("Find 2nd node: " + sll.findNthNode(2));
        sll.insert(12);
        sll.display();
        sll.insert(2, 2);
        sll.insert(4, 4);
        sll.insert(7, 6);
        sll.display();
        // sll.reverse();
        System.out.println("Mid node is: " + sll.mid());
        sll.removeDuplicates();
        sll.display();
        sll.delete(3);
        sll.display();
        sll.insertToSortedList(6);
        sll.display();
        sll.insertToSortedList(13);
        sll.display();
        System.out.println("Deleted key is: " + sll.deleteKey(7));
        sll.display();
        System.out.println("Deleted key is: " + sll.deleteKey(2));
        sll.display();
    }
}
