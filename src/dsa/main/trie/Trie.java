package dsa.main.trie;

public class Trie {

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        if (word == null || word.isEmpty())
            throw new IllegalArgumentException("Word cannot be empty");

        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (current.children[index] == null) {
                TrieNode newNode = new TrieNode();
                current.children[index] = newNode;
                current = newNode;
            } else {
                current = current.children[index];
            }
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                return current.isWord;
            } else {
                current = current.children[index];
            }
        }
        return current.isWord;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < root.children.length; i++) {
            TrieNode current = root.children[i];
            if (current == null) continue;
            sb.append((char) (i + 'a'));
            if (current.isWord)
                sb.append(", ");
            current = current.children[i];
        }
        sb.append("]");
        return sb.toString();
    }

    private class TrieNode {
        private final TrieNode[] children;
        private boolean isWord;

        public TrieNode() {
            children = new TrieNode[26]; // because we will be storing only english words
            isWord = false;
        }
    }
}
