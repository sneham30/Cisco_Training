'''
Created on Aug 18, 2015

@author: sneham
'''
#program to demonstrate list methods such as min,max,len,cmp nad lsit
from filecmp import cmp
list1=[10,20,30,40]
list2=[20,30,40,50,60,70]
list3=['a','b','c','d']
list4=['a','b','c','d']
print ("List1:" ,list1)
print ("List2:" ,list2)
print ("List3:" ,list3)
print ("List4:" ,list4)
print ("Mininum of list1:" ,min(list1))
print ("Mininum of list3:" ,min(list3))
print ("Maximum of list1:" ,max(list1))
print ("Maximum of list3:" ,max(list3))
print ("Length of List2:" ,len(list2))
'''print("Comparing(list3,list4)",cmp(list3,list4))
print("Comparing(list3,list1)",cmp(list3,list1))'''
seq = ('sneha','shree')
list5=list(seq)
print("Sequence:",seq)
print ("List1:" ,list5)