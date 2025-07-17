import java.util.LinkedList;

class HashTableChaining {
    private final int SIZE = 10;
    private LinkedList<Node>[] table;

    public HashTableChaining() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    class Node {
        String key;
        int value;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(String key, int value) {
        int index = hash(key);
        for (Node node : table[index]) {
            if (node.key.equals(key)) {
                node.value = value; // update
                return;
            }
        }
        table[index].add(new Node(key, value));
    }

    public Integer get(String key) {
        int index = hash(key);
        for (Node node : table[index]) {
            if (node.key.equals(key)) return node.value;
        }
        return null;
    }

    public boolean remove(String key) {
        int index = hash(key);
        for (Node node : table[index]) {
            if (node.key.equals(key)) {
                table[index].remove(node);
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + ": ");
            for (Node node : table[i]) {
                System.out.print("[" + node.key + " = " + node.value + "] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashTableChaining hashTable = new HashTableChaining();

        hashTable.put("apple", 10);
        hashTable.put("banana", 20);
        hashTable.put("orange", 15);
        hashTable.put("grape", 25);

        hashTable.display();

        System.out.println("Get banana: " + hashTable.get("banana"));

        hashTable.remove("orange");
        System.out.println("After removing orange:");
        hashTable.display();
    }
}
