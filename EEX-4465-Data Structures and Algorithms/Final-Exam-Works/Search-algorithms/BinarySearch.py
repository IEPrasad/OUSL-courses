FUNCTION BinarySearch(sortedArray, targetValue)
    DECLARE low AS INTEGER = 0
    DECLARE high AS INTEGER = sortedArray.length - 1

    WHILE low <= high:  
        DECLARE mid AS INTEGER = floor((low + high)/2)
        DECLARE midValue AS INTEGER = sortedArray[mid]

        IF midValue == targetValue:
            RETURN mid
        ELSE IF midValue < targetValue:
            low = mid + 1
        ELSE: 
            high = mid - 1
        
    RETURN - 1
END FUNCTION 
