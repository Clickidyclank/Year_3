# -*- coding: utf-8 -*-
"""
Created on Mon Sep 30 12:07:22 2019

@author: David
"""


"""
Q1

def powerV1(base,power):
    
   
    
    result = pow(int(base),int(power))
    return str(result)

def main():
    
    base = input("Please enter a base number")
    power = input ("Please enter a power")
    
    result =  powerV1(base,power)
    print("The value of " +base+ " raised to the power of "+power+ " equals "+result)
    
    
main()

"""


"""
Q1 part 2


import math
def powerV2(log,base):
    
    result = math.log(float(base),float(log))
    return str(result)

def main():
    
    base = input("Please enter a base number")
    log = input ("Please enter value A")
    
    result =  powerV2(base,log)
    print("The log of " +log+ " with base "+base+ " equals "+result)
    

main()


"""


"""
Q2

    
import random
    
def generateRandomNumber():
    randomnumber = random.randint(1,101)
    return randomnumber


def askUser():
    
    guess =input("Please enter a guess between 0 and 100")
    guess = int(guess)
    return guess
    
    
def checkGuess(guess,randomnumber,state):
    
    if (guess<randomnumber):
        print("Your guess is too low")
        state = False
        
    elif (guess>randomnumber):
        print("Your guess is too high")
        state = False
        
    else:
        state = True
        
    return state
        
    
    
    
def main():
    state = False
    randomnumber =  generateRandomNumber()
    print(randomnumber)
    guess = 0
    i = 0
    while (state == False):
        guess = askUser()
        i+=1
        state = checkGuess(guess,randomnumber,state)
    
    
    print("You guessed correctly it took you "+str(i)+" guesses.")


main()    

"""

"""
Q3


def factorial(num):
    if num>0:
        result = num*(factorial(num-1))
        return (result)
    else:
        return 1


     
def main():
    
    num = input("please enter a number ")
    num = int(num)
    result = factorial(num)
    print (result)


main()

"""
    
"""
Q4
"""


























    
    
    
    
    
    
    
    
    
    
    
    
    
    