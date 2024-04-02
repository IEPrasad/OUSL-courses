# first we look for the simple class

class Phone:
  def say(self, name):
    self.x = name
    print("hello", name)

phone1 = Phone()
phone1.say("nokia")
print(phone1.x)

phone1.x = "apple"
print(phone1.x)

phone2 = Phone()
phone2.say("samsung")
