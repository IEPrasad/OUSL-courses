
# 1)

# Let's imagine you need to create a list containing numbers from 1 to 50.
# Here is the code you would need to write:

'''
nums = []

for x in range(1, 51):
  nums.append(x)

print(nums)
'''


# 2)
# List comprehensions are useful shorthands for such operations. They offer a shorter and more readable way to create lists with various settings using just a single line of code.

'''
nums = [x for x in range(1, 51)]

print(nums)

''' 

# These two codes will produce the same answers.

Here is the generic syntax and structure of a list comprehension:

    <variable>: the variable that will store the newly created list
    <expression>: an expression performed on each item. If no specific action is needed, the item itself is used
    <item>: the current item being processed
    <iterable>: any iterable object, such as ranges, lists, strings, tuples, and sets

