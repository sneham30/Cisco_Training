'''
Created on Aug 19, 2015

@author: sneham
'''
tuple1=(10,20,30)
tuple2=('apple','mango','banana')
print ("Tuple1:",tuple1)
print ("Tuple2:",tuple2)
print ("Concatenated:",tuple1+tuple2)
print ("tuple1[0]:",tuple1[0])
print ("tuple2[-1]:",tuple2[-1])
tuple3=tuple1+tuple2
print ("Concatenated tuple3:",tuple3)
print ("replicating tuple2:",tuple2*3)
print ("Tuple3[0:4]",tuple3[0:4])
print ("Tuple3[-4:-1]",tuple3[-4:-1])
print ("Tuple3[4:6]",tuple3[4:6])
#tuple1[0]=100 --->is not supported because tuples are immutable
del tuple2
#print ("tuple2[-1]:",tuple2[-1]) -->tuple2 delete therefore this line throws error