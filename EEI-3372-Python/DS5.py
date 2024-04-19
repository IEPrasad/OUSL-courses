# What is an Exception 

#   **  An Exception is an event, which occurs during the exectuion of a program  
#     that disrupts the normal flow of the program's instructions.

#   ** Some common types of exceptions are listed in the table in the next slide 

# let's take two inputs from the user 

a = int(input("Enter num1: "))
b = int(input("Eter num2: "))



'''
def test(num1, num2):
  try:
    return num1 / num2

  except ZeroDivisionError:
    print("Cant divide by zero")
  
  else: 
    return num1 / num2
  
print(test(a, b))
'''

# or we can use like these 

# def test2(x, y):
#   try:
#     print(x / y)
#   except:
#     print("Cant divide x by y")

# test2(a, b)


# --------- let see another example 
'''
try:
  # print(a / b)
  print(x)

except ZeroDivisionError:
  print("Cant divide by zero")

except NameError:
  print("Undefined variable found")

except:
  print("There is an error!")

'''
## this is how to use multiple except 



# ----- Else 

'''

try: 
  print(a / b)

except ZeroDivisionError:
  print("Cant divide by zero")

else:
  print("Nothing went wrong.")
  
'''
'''

try:
  print(a / b)

except ZeroDivisionError:
  print("Can't divide by zero")

except NameError:
  print("Undefind name found")

else:
  print("Nothing went wrong")

'''
# Finally ---------------

'''

try:
  print(a / b)
except ZeroDivisionError:
  print("Cant divide by zero")
except NameError:
  print("Undefined variable found")
finally:
  print("Exception handling finished")

'''
# -------------- 

'''

try:
  f = open("demofile.txt")
  try:
    f.write("Lorum Ispum")
  except:
    print("Something went wrong when writing to the file")
  finally:
    f.close()
  
except:
  print("Something went wrong when opening the file")

'''


'''
# ---- if we need to really write something inside the file we have to use it like this 
try: 
  # with open("demofile.txt", "w") as f: ## when we use "w" that will remove everything 
  # and relplace what we put inside the ""
  with open("demofile.txt", "a") as f: ## by using "a" it will append the details inside the file
    try:
      f.write("\nLorum ispum")
    except:
      print("Somthing went wrong when writing to the file")

    finally:
      f.close()

except:
  print("Something went wrong when opening the file")

'''


# ----- let's see another one 


try:
  print(x)

  try:
    div = 10 / 0
  except:
    # print("Division Error")
    pass

except:
  print("Unknown variable")

