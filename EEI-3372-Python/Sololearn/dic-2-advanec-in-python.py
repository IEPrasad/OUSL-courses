from collections import defaultdict

# Count the occurrences of each character in a string using defaultdict
string = "hello world"
char_count = defaultdict(int)
for char in string:
    char_count[char] += 1
print(char_count)
