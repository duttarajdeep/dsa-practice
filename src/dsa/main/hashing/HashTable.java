package dsa.main.hashing;

public class HashTable {

    private final HashNode[] buckets;
    private final int numOfBuckets;
    private int size; // total no.of hash-nodes in the table

    public HashTable() {
        this(10);
    }

    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(Integer key, String value) {
        if (key == null || value == null)
            throw new IllegalArgumentException("Key or Value can not be empty");

        int bucketIndex = getBucketIndex(key);

        HashNode head = buckets[bucketIndex];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;

        //reverting the head back to the first
        head = buckets[bucketIndex];

        HashNode newNode = new HashNode(key, value);
        newNode.next = head;
        buckets[bucketIndex] = newNode;
    }

    public String get(Integer key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null");

        int bucketIndex = getBucketIndex(key);

        HashNode head = buckets[bucketIndex];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String remove(Integer key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null");
        int bucketIndex = getBucketIndex(key);

        HashNode head = buckets[bucketIndex];
        HashNode prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets[bucketIndex] = head.next;
                } else {
                    prev.next = head.next;
                    head.next = null;
                }
                size--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    public int getBucketIndex(Integer key) {
        return key % numOfBuckets;
    }

    private class HashNode {
        private final Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
