def case1():
  return "Case 1"

def case2():
  return "Case 2"

def case3():
  return "Case 3"

def default_case():
  return "Invalid case"

def switch_case(argument):
  switcher = {
    1: case1,
    2: case2,
    3: case3,
  }

  # Get the function corresponding to the argument default_case
  case_function = switcher.get(argument, default_case)
  # Call the function and return its result
  return case_function()


# Test the switch_case function 

print(switch_case(1)) # Output: Case 1
print(switch_case(3)) # Output: Case 3
print(switch_case(5)) # Output: Invalid case

