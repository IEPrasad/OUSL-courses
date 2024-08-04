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


# Initialize the hidden value
hidden_number = 6

# Loop until the correct guess is made
while True:
    # Ask the user to enter a guess
    guess = int(input("Enter a guess (number between 1-30): "))
    
    # Check if the guess is correct
    if guess == hidden_number:
        print("Congratulations! Your guess is correct.")
        break
    else:
        print("Incorrect guess. Please try again.")
