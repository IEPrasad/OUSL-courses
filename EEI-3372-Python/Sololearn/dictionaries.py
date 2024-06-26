    # 1 Creating a dictionary:


# Method 1: Using curly braces and key-value pairs
my_dict = {'apple': 1, 'banana': 2, 'cherry': 3}

# Method 2: Using the dict() constructor
my_dict = dict(apple=1, banana=2, cherry=3)



    # 2 Filtering even numbers from a list:

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
even_numbers = [x for x in numbers if x % 2 == 0]
print(even_numbers)


    # 3 Converting a list of strings to uppercase:

words = ["apple", "banana", "cherry"]
uppercase_words = [word.upper() for word in words]
print(uppercase_words)



    # 4 Creating a list of tuples containing numbers and their squares:

numbers = [1, 2, 3, 4, 5]
number_square_pairs = [(x, x ** 2) for x in numbers]
print(number_square_pairs)



    # 5 Flattening a 2D list:

matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
flattened_list = [item for sublist in matrix for item in sublist]
print(flattened_list)


    # Creating a dictionary from two lists:

keys = ['a', 'b', 'c']
values = [1, 2, 3]
dictionary = {k: v for k, v in zip(keys, values)}
print(dictionary)

