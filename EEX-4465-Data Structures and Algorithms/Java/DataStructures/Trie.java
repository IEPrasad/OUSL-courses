public class Trie {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word
    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (current.children[idx] == null) {
                current.children[idx] = new TrieNode();
            }
            current = current.children[idx];
        }
        current.isEndOfWord = true;
    }

    // Search for a word
    public boolean search(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (current.children[idx] == null) return false;
            current = current.children[idx];
        }
        return current.isEndOfWord;
    }

    // Starts with prefix
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char ch : prefix.toCharArray()) {
            int idx = ch - 'a';
            if (current.children[idx] == null) return false;
            current = current.children[idx];
        }
        return true;
    }

    // Main
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("car");
        trie.insert("dog");

        System.out.println("Search 'car': " + trie.search("car"));    // true
        System.out.println("Search 'cap': " + trie.search("cap"));    // false
        System.out.println("Starts with 'ca': " + trie.startsWith("ca")); // true
    }
}
