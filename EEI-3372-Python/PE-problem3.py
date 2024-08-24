# Largest prime factor

#     What is the largest prime factor of the number 600851475143?

x = 600851475143
i = 600851475143
result = 0

while (i >= 1):
    result = x/i
    if (i >= 1):
        if (result <= x and x % i == 0 and i % 2 != 0):
            print(i)
            i -= 1
    else:
        break
    i -= 1
    



#  this version seem like correct and 
# try this code again
