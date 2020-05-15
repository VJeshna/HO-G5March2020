'''
Created on 28-Apr-2020

@author: vanitajeshnani
'''

class Product:
    '''
    classdocs
    '''
    counter=0

    def __init__(self, productid,productname,quantity,price):
        '''
        Constructor
        '''
        self.productid=productid
        self.productname=productname
        self.quantity=quantity
        self.price=price
        
    def displayProduct(self):
        print(self.productid)
        print(self.productname)
        print(self.quantity)
        print(self.price)