# -*- coding: utf-8 -*-
"""
Created on Mon Oct  7 12:14:53 2019

@author: David
"""

def main() :
    loop = "n"
    name= ""
    f = open(r"studentDetails.txt","r")
    details = {}

    for userline in f:
        data = userline.split()
        avg = ((int(data[1])+int(data[2])+int(data[3]))/3)  
        """print(data[0],avg)"""
        details[data[0]] = avg;
        
        
        
    while name!="n":
        name = input("Please enter a name you wish to have the grade for ")
        if name in details:
            print(details[name])
        else :
            print("you have searched for a name we do not have")
    print("exit") 
        
main()