# Pseudocode: QuickSort(Array, low, high) - Recursive
FUNCTION QuickSort(Arr, low, high)
    IF low < high THEN 
        // pi is partitioning index, Arr[pi] is now at right place 
        SET pi = CALL Partition(Arr, low, high)

        CALL QuickSort(Arr, low, pi - 1) // Recursively sort elements before partition
        CALL QuickSort(Arr, pi + 1, high) // Recursively sort elements after partition
    ENDIF
END FUNCTION

// Pseudocode: Partition(Array, low, high) - Helper Function
FUNCTION Partition(Arr, low, high)
    SET pivot = Arr[high] // Choose the last element as pivot 
    SET i = (low - 1) // Index of smaller element 

    FOR j = low TO high - 1
        // If current element is smaller than or equal to pivot 
        IF Arr[j] <= pivot THEN 
            INCREMENT i
            SWAP Arr[i] and Arr[j]
        ENDIF 
    ENDFOR 
    SWAP Arr[i + 1] and Arr[high]
    RETURN (i + 1)
END FUNCTION