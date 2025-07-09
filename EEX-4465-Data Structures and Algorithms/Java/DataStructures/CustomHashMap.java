import java.util.LinkedList;

public class CustomHashMap {
    class Entry {
        String key;
        int value;

        Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10;
    private LinkedList<Entry>[] table;

    public CustomHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(String key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    // Put key-value
    public void put(String key, int value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    // Get value
    public int get(String key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return -1; // Not found
    }

    // Print map
    public void printMap() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Entry e : table[i]) {
                System.out.print("[" + e.key + " → " + e.value + "] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.printMap();

        System.out.println("Get 'two': " + map.get("two"));
    }
}
