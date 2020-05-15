'''
Created on 28-Apr-2020

@author: vanitajeshnani
'''

class Employee:
    counter = 0
    def __init__(self,empno,ename,deptno):
        self.empno=empno
        self.ename=ename
        self.deptno=deptno
        Employee.counter = Employee.counter+1
 

    def displayEmployeeDetails(self):
        print(self.empno)
        print(self.ename)
        print(self.deptno)
        
        
        
print("Employee.__doc__    ",Employee.__doc__)
print("Employee.__name__   ",Employee.__name__)
print("Employee.__module__ ",Employee.__module__)
print("Employee.__dict__    ",Employee.__dict__)
print("Employee.__doc__     ",Employee.__doc__)
    