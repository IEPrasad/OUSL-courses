# Pseudocode: SelectionSort(Array)
FUNCTION SelectionSort(Arr)
    SET n = Arr.length
    FOR i = 0 TO n-2
        SET min_idx = i
        FOR j = i+1 TO n-1
            IF Arr[j] < Arr[min_idx] THEN   
                SET min_idx = j
            ENDIF 
        ENDFOR
        // Swap the found minimum element with the first element of unsorted part 
        SWAP Arr[i] and Arr[min_idx]
    ENDFOR 
END FUNCTION


Selection Sort 

    This Pseudocode describes the Selection Sort algorithm. It works by repeatedly finding the 
    smallest element from the unsorted part of the array and placing it at the beginning of the sorted 
    part.

    1. Outer Loop: Iterates through the array to mark the beginning of the unsorted section.

    2. Inner Loop: Scans the unsorted section to find the smallest element. It keeps track of the index of this minimum value (min_idx).

    3. Swap: After the inner loop finishes, the smallest element found is swapped with the first element of the unsorted section.

This process continues until the entire array is sorted.