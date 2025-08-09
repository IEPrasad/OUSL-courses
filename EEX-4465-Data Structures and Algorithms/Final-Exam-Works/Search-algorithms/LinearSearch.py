FUNCTION linearSearch(array, targetValue):
    DECLARE n AS INTEGER = array.length
    FOR i FROM 0 TO n-1:
        IF array[i] == targetValue:
            RETURN i  // අගය හමු වුවහොත් index එක ලබා දෙයි.
    RETURN -1  // අගය හමු නොවුවහොත් -1 ලබා දෙයි.
END FUNCTION