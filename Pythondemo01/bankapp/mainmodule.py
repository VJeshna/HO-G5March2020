'''
Created on 28-Apr-2020

@author: vanitajeshnani
'''
from bankapp.bankaccount import BankAccount, SavingAccount


if __name__ == '__main__':
    
    acc1 = BankAccount(1001,"Vanita",1000)
    sacc1 = SavingAccount(1000,"VanitaS",2000)
    print(acc1)
    print(sacc1)
    
    BankAccount.my_classdata()
    SavingAccount.my_staticdata()

    pass