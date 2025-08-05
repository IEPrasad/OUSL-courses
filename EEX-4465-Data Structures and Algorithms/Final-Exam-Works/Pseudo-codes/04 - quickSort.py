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


# ---------------------------

'''

QuickSort Function

The QuickSort function is the main recursive component.

    1.  Base Case: The IF low < high condition is the base case. If the subarray has one or zero elements (low is 
        not less than high), it's considered sorted and the function returns.

    2.  Divide: It calls the Partition helper function, which rearranges the subarray and returns the 
        partitioning index (pi). At this point, the pivot element is in its final sorted position.

    3.  Conquer: It then recursively calls itself on the left subarray (QuickSort(Arr, low, pi - 1)) and the 
        right subarray (QuickSort(Arr, pi + 1, high)) to sort the elements on either side of the pivot.

Partition Function

The Partition function is the key to QuickSort's logic.

    1.  Pivot Selection: It selects the last element of the subarray as the pivot.

    2.  Reordering: It uses a pointer i to keep track of the boundary between elements smaller than the pivot   
        and  elements larger than it. It iterates through the subarray with a pointer j. If Arr[j] is less than 
        or equal to the pivot, it increments i and swaps Arr[i] with Arr[j]. This moves all smaller elements to 
        the beginning of the subarray.

    3.  Final Placement: After the loop, it swaps the pivot element (Arr[high]) with the element at i + 1. This 
        places the pivot in its correct, sorted position, with all smaller elements to its left and all larger 
        elements to its right. The function then returns this final index of the pivot.

'''