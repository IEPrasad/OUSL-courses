What will be the output of the following Python code?

class A:
    def __init__(self):
        self.multiply(15)
        print(self.i)
 
    def multiply(self, i):
        self.i = 4 * i;
class B(A):
    def __init__(self):
        super().__init__()
 
    def multiply(self, i):
        self.i = 2 * i;
obj = B()


Question 5 Select one:

a. An exception is thrown
b. 30
c. 60
d. 15


# ** The answer is b
#  try to learn how to come this answer 
