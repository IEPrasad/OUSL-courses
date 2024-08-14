total_amount = int(input("Enter total amount: "))

def Discount_Cal(total_amount):
  if (total_amount < 2500):
    discount = total_amount * 5/100
  elif (total_amount >= 2500 and total_amount <= 5000):
    discount = total_amount * 10/100
  elif (total_amount > 5000):
    discount = total_amount * 15/100
  final_bill_value = total_amount - discount
  return final_bill_value

print("Final bill value is:",Discount_Cal(total_amount))



