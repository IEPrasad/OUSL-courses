'''
def switch_case(argument):
  switcher = {
    1: "Case 1",
    2: "Case 2",
    3: "Case 3",
    4: "Case 4"
  }

  return switcher.get(argument, "Invalid case")

# Test the switch_case function 
print(switch_case(1)) # Output: Case 1
print(switch_case(3)) # Output: Case 3
print(switch_case(5)) # Output: Invalid case

# if we use if else functionality for that
# ---------vvvvvvv--------------
'''
def switch_case(argument):
  if argument == 1:
    return "Case 1"
  elif argument == 2:
    return "Case 2"
  elif argument == 3:
    return "Case 3"
  elif argument == 4:
    return "Case 4"
  else:
    return "Invalid case"


# Test the switch_case funtion 
print(switch_case(1)) # Output: Case 1
print(switch_case(3)) # Output: Case 3
print(switch_case(5)) # Output: Invalid case 

