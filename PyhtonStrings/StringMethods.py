'''
Created on Aug 14, 2015

@author: sneham
'''
str1='sneha'
print ("String1:",str1)
print ("Captalize(String1):" ,str1.capitalize())
str2="Hello Sneha!!!"
print ("String2",str2)
print ("Number of '!' in String2:" ,str2.count(str2[-1]))
print ("Does String1 ends with '!'?",str1.endswith('!'))
print ("Does String2 ends with '!'?",str2.endswith('!'))
print ("Index of 'e' in String1",str1.find('e'))
print ("Index of 'S' in String1",str2.index('S'))
str3='Arun12'
print ("String3",str3)
print ("Is String3 Alphanumeric?",str3.isalnum())
print ("Is String1 Alpha?",str1.isalpha())
str4='1'
str5='a'
str6='2.3'
str7='if'
str8='B'
str9=' '
print ("Is '",str4,"' is numeric?",str4.isdigit())
print ("Is '",str5,"' is numeric?",str5.isdigit())
print ("Is '",str6,"' is decimal?",str6.isdecimal())
print ("Is '",str5,"' lower?" ,str5.islower())
print ("Is '",str5,"' upper?" ,str5.isupper())
print ("Is '",str7,"' is an identifier?",str7.isidentifier())
print ("Is '",str8,"' upper?" ,str8.isupper())
print ("Is '",str9,"' a space?" ,str9.isspace())
print ("Is '",str8,"' a space?" ,str8.isspace())

print ("Length(",str1,"):",len(str1))
print ("Length(",str2,"):",len(str2))

print('Upper(',str1,'):',str1.upper())
print('Lower(',str2,'):',str2.lower())

print('Do String',str1,'starts with "a"?',str1.startswith('a'))
print('Do String',str1,'starts with "s"?',str1.startswith('s'))

print('SwapCase(',str2,'):',str2.swapcase())
str2="            hello Sneha!!      "
print('triming leading spaces in ',str2,'is:',str2.lstrip())
print('triming trailing spaces in ',str2,'is:',str2.rstrip())