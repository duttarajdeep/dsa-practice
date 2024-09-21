package leetcode.java.sept21;

import java.util.LinkedList;

public class HashSet {

    private final int numOfBuckets;
    private final LinkedList<Integer>[] buckets;

    public HashSet() {
        this.numOfBuckets = 15000;
        this.buckets = new LinkedList[this.numOfBuckets];
        for (int i = 0; i < numOfBuckets; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public int hash(int key) {
        return key % numOfBuckets;
    }

    public void add(int key) {
        int i = hash(key);
        LinkedList<Integer> chain = buckets[i];
        if (!contains(key))
            chain.add(key);
    }

    public void remove(int key) {
        int i = hash(key);
        LinkedList<Integer> chain = buckets[i];
        if (contains(key))
            chain.remove((Integer) key);
    }

    public boolean contains(int key) {
        int i = hash(key);
        LinkedList<Integer> chain = buckets[i];
        return chain.contains(key);
    }
}
