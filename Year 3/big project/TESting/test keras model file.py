# -*- coding: utf-8 -*-
"""
Created on Sun Sep 29 20:02:16 2019

@author: David
"""



from numpy import loadtxt
from keras.models import Sequential
from keras.layers import Dense

#load the dataset
dataset = loadtxt("pima-indians-diabetes.cvs",delimiter=",")
#split into input x and output y variables
X = dataset [:,0:8]
Y = dataset [:,8]


cl