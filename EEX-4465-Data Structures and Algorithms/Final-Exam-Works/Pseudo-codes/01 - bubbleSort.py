# Pseudocode: BubbleSort(Array)
FUNCTION BubbleSort(Arr)
    SET n = Arr.length
    FOR i = 0 TO n-2
        FOR j = 0 TO n-2-i
            IF Arr[j] > Arr[j+1] THEN
                SWAP Arr[j] and Arr[j+1]
            ENDIF
        ENDFOR
    ENDFOR
END FUNCTION


This Pseudocode is for the Bubble Sort algorithm, a method to sort an array.

Here's how it works 

    1. Outer Loop: Controls the number of passes over the array. After each pass, the largest 
    remaining unsorted element moves to its correct final position.

    2. Inner Loop: Compares each pair of adjacent elements.

    3. Swap: If an element is larger than the one next to it, they swap positions.


This Process repeats until the entire array is sorted from smallest to largest.
