# 1) 
# a. Briefly explain 3 feature of Python programming language
#     ** We can use for backend develoment 
#     ** We can use the python for the develop applications
#     ** We can use the python for the machine learning 

# b. Briefly explain the interactive mode and Script mode in Python programming language

#     ** interactive mode 
#   - we can create application, with radio buttons, buttons, input fields like this 
  
#     ** but with script mode 
#   - we can only give me the input and get the out put only 

# c. Explain the difference between Break, Continue, and Pass Statement with an example.

#     ** if we want to break stop executing next steps 
#       after the condtion 
#       we can use like this

#         if ( x >= 3):
#           print("hello"):
#         else: 
#           print("X is not greater than or equal 3")
#           break

#     ** if we want to continue the executing next steps 
#     after the condtion
#     we can use like this
#       if (x >= 3):
#         print("hello")
#       else:
#         print("Welcome")
#         continue

#     ** if we need to pre defined a function or like this we can use the pass keyword like this
      
#       def calculateMarks():
#         pass

# -------------- ^^^^ marks for this 15/30 ------------


total_amount = int(input("Enter total amount: "))


def Disount_Cal(total_amount):
  amount = total_amount
  if (total_amount < 2500):
    amount -= total_amount * 5/100 
  elif (total_amount > 2500 and total_amount < 5000):
    amount -= total_amount * 10/100
  elif (total_amount > 5000):
    amount -= total_amount * 15/100
  
    print("total_amount is: ", total_amount)

  print("Discounted amount: ", amount)  

Disount_Cal(total_amount)

        
