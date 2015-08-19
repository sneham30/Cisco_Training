'''
Created on Aug 18, 2015

@author: sneham
'''
#program to demonstrate list operations such as update,append and Delete
list1=[10,20,30,100,'sneha','shree']
print ("List:" , list1)
list1[4]='tara'
print('List after updating:' ,list1)
list1.append('sneha')
print('List after appending "sneha":',list1)
del list1[5]
print ('List after deleting 6th element:',list1)
