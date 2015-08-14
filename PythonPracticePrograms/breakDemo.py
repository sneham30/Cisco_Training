'''
Created on Aug 14, 2015

@author: sneham
'''
find=55
list=[10,20,30,44,55,40]
count=0
for i in list:
    if(i==find):
        print ("Element found!!!");
        break
    count+=1
if (count==list.__len__()):
    print ("No such element in list")
