package dsa.main.trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("dog");
        System.out.println("Found abc: " + trie.search("abc"));
        System.out.println(trie);
    }
}
