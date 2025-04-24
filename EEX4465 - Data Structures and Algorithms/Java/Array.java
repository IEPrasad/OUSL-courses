public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[5];  // Declare array

        // Insert
        arr[0] = 10;
        arr[1] = 20;

        // Access
        System.out.println("Element at index 1: " + arr[1]);

        // Update
        arr[1] = 25;

        // Delete (manual, just skip/replace)
        arr[1] = 0;

        // Traverse
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
