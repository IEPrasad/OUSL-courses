# Create a dictionary with only even numbers as values using dictionary comprehension
original_dict = {'a': 1, 'b': 2, 'c': 3, 'd': 4, 'e': 5}
even_dict = {k: v for k, v in original_dict.items() if v % 2 == 0}
print(even_dict)
