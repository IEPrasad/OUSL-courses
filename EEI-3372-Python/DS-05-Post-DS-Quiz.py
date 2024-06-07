# class Test:
#     def __init__(self):
#         self.x = 0
# class Derived_Test(Test):
#     def __init__(self):
#         self.y = 1
# def main():
#     b = Derived_Test()
#     print(b.x,b.y)
# main()


# class A:
#     def __init__(self):
#         self.multiply(15)
#         print(self.i)
 
#     def multiply(self, i):
#         self.i = 4 * i
# class B(A):
#     def __init__(self):
#         super().__init__()
 
#     def multiply(self, i):
#         self.i = 2 * i
# obj = B()




a = int(input("Enter first value: "))
b = int(input("Enter second value: "))

def devide (a, b):
    return a/b

print(devide(a, b))

