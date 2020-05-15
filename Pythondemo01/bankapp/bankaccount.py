'''
Created on 28-Apr-2020

@author: vanitajeshnani
'''

class BankAccount(object):
    '''
    classdocs
    '''

    def __init__(self,accNo,accName,balance):
        self.accNo=accNo
        self.accName=accName
        self.balance=balance
    
    def __str__(self, *args, **kwargs):
        return str(self.accNo)+" "+self.accName+" "+str(self.balance)
    
    @classmethod
    def my_classdata(cls):
        print("  myclassdata")
    
    @staticmethod
    def my_staticdata():
        print("  mystaticdata")

class SavingAccount(BankAccount):
    def __init__(self,accNo,accName,balance):
        BankAccount.__init__(self, accNo, accName, balance)
        
    def __str__(self, *args, **kwargs):
        return str(self.accNo)+" "+self.accName+" "+str(self.balance)
    