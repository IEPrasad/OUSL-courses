// File: BinaryInsertionSort.java

public class BinaryInsertionSort {

    // Binary search to find the index where to insert the element
    static int binarySearch(int[] arr, int item, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (item == arr[mid])
                return mid + 1;
            else if (item > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    static void binaryInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int j = i - 1;

            // Find location to insert
            int loc = binarySearch(arr, x, 0, j);

            // Shift elements to right
            while (j >= loc) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = {37, 23, 0, 17, 12, 72, 31};
        binaryInsertionSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
