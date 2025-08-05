# Pseudocode: MergeSort(Array, left, right) - Recursive 
FUNCTION MergeSort(Arr, left, right)
    IF left < right THEN 
        SET mid = (left + right) / 2
        CALL MergeSort(Arr, left, mid)
        CALL MergeSort(Arr, mid + 1, right)
        CALL Merge(Arr, left, mid, right) // Helper function to merge two sorted halves
    ENDIF 
END FUNCTION

# Pseudocode: Merge(Array, left, mid, right) - Helper Function 
FUNCTION Merge(Arr, left, mid, right)
    // Create temporary arrays L and R
    SET n1 = mid - left + 1 
    SET n2 = right - mid 
    CREATE L[n1], R[n2]

    // Copy data to temp arrays L[] and R[]
    FOR i = 0 TO n1-1
        SET L[i] = Arr[left + i]
    ENDFOR 

    FOR j = 0 TO n2-1
        SET R[j] = Arr[mid + 1 + j]
    ENDFOR

    // Merge the temp arrays back into Arr[left...right]
    SET i = 0 // Initial index of first subarray
    SET j = 0 // Initial index of second subarray 
    SET k = left // Initial index of merged subarray 

    WHILE i < n1 AND j < n2
        IF L[i] <= R[j] THEN 
            SET Arr[k] = L[i]
            INCREMENT i 
        ELSE 
            SET Arr[k] = R[j]
            INCREMENT j
        ENDIF
        INCREMENT k
    ENDWHILE 

    // Copy remaining elements of R[] if any
    WHILE j < n2
        SET Arr[k] = R[j]
        INCREMENT j
        INCREMENT k
    ENDWHILE
END FUNCTION


# --------------------

'''

MergeSort Function

The MergeSort function is the core recursive part of the algorithm.

    1.  Base Case: The IF left < right condition acts as the base case for the recursion. If left is not less 
        than right, it means the subarray has one element or is empty, so it's already sorted and the function 
        returns without doing anything.

    2.  Divide: If the condition is true, it finds the midpoint of the array. It then recursively calls itself on 
        the left half (MergeSort(Arr, left, mid)) and the right half (MergeSort(Arr, mid + 1, right)). This 
        process continues until the array is fully divided into single-element subarrays.

    3.  Conquer: Once the recursion unwinds, the Merge function is called to combine the sorted halves.

Merge Function

The Merge function is a helper function that takes two sorted subarrays and merges them into a single sorted array.

    1.  Temporary Arrays: It first creates two temporary arrays, L and R, to hold the elements of the left and 
        right subarrays, respectively.

    2.  Comparison and Merging: It then iterates through both temporary arrays, comparing elements from L and R 
        and placing the smaller element into the correct position in the original array Arr. This continues until 
        all elements from one of the temporary arrays have been placed.

    3.  Remaining Elements: Finally, it copies any remaining elements from the temporary arrays back into the 
        original array. This handles cases where one subarray might have more elements than the other.

'''