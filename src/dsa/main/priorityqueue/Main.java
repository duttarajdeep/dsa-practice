package dsa.main.priorityqueue;

public class Main {
    public static void main(String[] args) {
        MaxPriorityQueue maxPQ = new MaxPriorityQueue(3);

        maxPQ.insert(9);
        maxPQ.insert(3);
        maxPQ.insert(2);
        maxPQ.insert(4);
        maxPQ.insert(5);
        maxPQ.insert(6);
        maxPQ.insert(1);
        maxPQ.insert(10);

        maxPQ.printMaxPQ();

        int max = maxPQ.deleteMax();
        System.out.println("Max was: " + max);

        maxPQ.printMaxPQ();
    }
}
