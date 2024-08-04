# 2. GAME Warrior company is designing a number guessing game as their first ever game
# launch.
# Write Python code for the following:
# • Initialise a variable with a hidden value 6.
# • Ask the user to enter a guess (number between 1- 30).
# • Loop while the guess is NOT the hidden number.
# • Within the loop
# o State an error message when the guess is not correct and ask the user to
# enter the next guess between 1- 30.
# • If the guess is correct, the loop has to stop and let the user know the guess is correct.


i = int(input("Enter number between 1-30: "))
x = 6
if (x == i):
  print("You win!, you are correct.")

else:
  while (i != x):

    if (i <= 30 and i >=1):
      if (i == x):
        print("You are correct, you win the game!")
      else:
        print("Try again.")
        i = int(input("Enter number between 1-30: "))
        if (x == i):
          print("You win!, you are correct.")

    else:
      print("Input Error!, please enter number between 1-30")
      i = int(input("Enter number between 1-30: "))
      if (i == x):
        print("You win!, you are correct.")

