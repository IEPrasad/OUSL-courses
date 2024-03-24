# 1) 
# i)

name = "Isuru Prasad"
first_sem_courses = ["EEI3372", "EEI3346", "EEM3366"]

# ii) 
# type of name = string
# type of first_sem_courses = string 

# ** name is string, because it's values in inside the ""
# ** first_sem_courses = list 
# ** because it's values in inside the []


def change_name(var1) :
  var1 += ", Hello!"
  print("Name inside the function :", var1)

def change_first_sem_courses(var2) :
  var2.append('END')
  print(f"Courses inside the function : {var2}")

change_name(name)
print("Name outside the function :", name)

change_first_sem_courses(first_sem_courses)
print(f"Courses outside the function : {first_sem_courses}")

# iii)

