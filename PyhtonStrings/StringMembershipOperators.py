'''
Created on Aug 14, 2015

@author: sneham
'''
#program to demonstrate String membership operators 'in' and 'not in'
str1='aneha'
str2='shree'
str3='snehashree'
print ("String1:",str1)
print ("String2:",str2)
print ("String3:",str3)
print ("Is first letter of string1 in string 2?",str1[0] in str2)
print ("Is string1 in string3",str1 in str3)
print ("Is string2 in string3",str2 in str3)
print ("Is string1 not in string3",str1 not in str3)