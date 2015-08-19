'''
Created on Aug 19, 2015

@author: sneham
'''
list1=['sneha','apple','boy',10,20,30,40,50,60,70,'apple','apple']
print ("List:",list1)
print ('Index(40)',list1.index(40))
print ('count(apple)',list1.count('apple'))
print ('pop():' ,list1.pop())
print ("List:",list1)
print ("pop(2):",list1.pop(1))
print ("List:",list1)
print ("inserting 80 after 70")
idx = list1.index(70)
list1.insert(idx+1,80)
print ("List:",list1)
seq=(90,100,'cat')
print ("sequence:" ,seq)
print ('Extending list with sequence:')
list1.extend(seq)
print ("List:",list1)
print('Removing sneha from list')
list1.remove('sneha')
print ("List:",list1)
print('Reversing the list:')
list1.reverse()
print ("List:",list1)
list2=[678,34,124,67,90,234]
print ("NewList:",list2)
print ("sorting NewList:")
list2.sort()
print ("NewList:",list2)
list3=['sneha','arun','krithika','shruthi','rahul','vaibhav','solar','rashmi']
print ("NameList+:",list3)
print ("sorting NameList:")
list3.sort()
print ("NameList:",list3)
