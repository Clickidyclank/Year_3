# -*- coding: utf-8 -*-
"""
Spyder Editor

@pj Oregan
"""

#First Neural Network Tutorial
from numpy import loadtxt
from keras.models import Sequential
from keras.layers import Dense

# load the dataset
dataset = loadtxt('processed_cleveland_use.csv', delimiter=',')
# split into input (X) and output (y) variables
X = dataset[:,0:14]
y = dataset[:,13] 

# define the keras model
model = Sequential()
model.add(Dense(30, input_dim=14, activation='relu'))
model.add(Dense(20, activation='relu'))
model.add(Dense(1, activation='sigmoid'))

# compile the keras model
model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])

# fit the keras model on the dataset
model.fit(X, y, epochs=1100, batch_size=80)

# evaluate the keras model
_, accuracy = model.evaluate(X, y)
print('Accuracy: %.2f' % (accuracy*100))

# make class predictions with the model
predictions = model.predict_classes(X)
# summarize the first 5 cases
for i in range(100):
	print('%s => %d (expected %d)' % (X[i].tolist(), predictions[i], y[i]))
    
import pickle 
pickle.dump()