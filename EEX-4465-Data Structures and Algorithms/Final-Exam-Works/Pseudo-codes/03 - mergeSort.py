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