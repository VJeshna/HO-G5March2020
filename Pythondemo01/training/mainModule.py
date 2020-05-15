'''
Created on 27-Apr-2020

@author: vanitajeshnani
'''
from training.employee import Employee


print("oop python")

emp1 = Employee(1001,"Vanita",10)
emp2 = Employee(1002,"Vanita",10)
emp3 = Employee(1003,"Vanita",10)


emp1.displayEmployeeDetails()
emp2.displayEmployeeDetails()
emp3.displayEmployeeDetails()

print("total number of objects",Employee.counter)

emp1.designation = "Accountant"
emp2.designation = "Developer"

print(hasattr(emp1, "designation"))
print(getattr(emp2, "designation"))
print(setattr(emp3, "designation","Tester"))
print(getattr(emp3, "designation"))

# prd1 = Product(1001,"Maggie",10,15)
# prd2 = Product(1002,"Kitkat",15,45)
# prd3 = Product(1003,"Sprite",19,60)
# 
# 
# prd1.displayProduct()
# prd2.displayProduct()
# prd3.displayProduct()

print("total number of objects",Employee.counter)
if __name__ == '__main__':
    pass