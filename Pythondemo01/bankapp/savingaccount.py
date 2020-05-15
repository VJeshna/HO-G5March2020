'''
Created on 28-Apr-2020

@author: vanitajeshnani
'''

class SavingAccount:
    '''
    classdocs
    '''
    counter=0

    def __init__(self, accno,accname,balance):
        '''
        Constructor
        '''
        self.accno=accno
        self.accname=accname
        self.balanace=balance

    def get_accno(self):
        return self.__accno


    def get_accname(self):
        return self.__accname


    def get_balanace(self):
        return self.__balanace


    def set_accno(self, value):
        self.__accno = value


    def set_accname(self, value):
        self.__accname = value


    def set_balanace(self, value):
        self.__balanace = value


    def del_accno(self):
        del self.__accno


    def del_accname(self):
        del self.__accname


    def del_balanace(self):
        del self.__balanace

    accno = property(get_accno, set_accno, del_accno, "accno's docstring")
    accname = property(get_accname, set_accname, del_accname, "accname's docstring")
    balanace = property(get_balanace, set_balanace, del_balanace, "balanace's docstring")
        
        
        