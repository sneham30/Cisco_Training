'''
Created on Aug 14, 2015

@author: sneham
'''
#program to add digits of a number
n=143
num=n
sum = 0
while n>0:
    r=n%10
    sum+=r
    n=n/10
print ("Sum of disgits of " ,num ,"is:" ,sum)
