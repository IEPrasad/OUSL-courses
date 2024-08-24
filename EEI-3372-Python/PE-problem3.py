# Largest prime factor

#     What is the largest prime factor of the number 600851475143?

x = 600851475143
i = 1
result = 0

while (i <= x):
    result = x/i
    while (result >= 1):
        print(result)
        i += 1
    i += 1
# i = 10
# while (i >= 0):
#     print(i)
#     i -= 1
