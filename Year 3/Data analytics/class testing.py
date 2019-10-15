# -*- coding: utf-8 -*-
"""
Created on Mon Oct 14 10:07:15 2019

@author: David
"""

import numpy as np

data = np.array([[1,2,3],[2,3,4],[3,4,5],[6,7,8]],int)

a = np.array([[21,20,23],[2,340,4],[3,4,985],[6,7221,8]],int)

c = np.vstack((a,data))
print (c)

print(c[1][1])
c = np.hstack((a,data))

print(c)

print(c[1][1])

c = np.concatenate((a,data),axis = 0)

print(c)


c = np.


