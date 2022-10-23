
# Palindrome FRQ 
Assume that the classes listed in the Java Quick Reference have been imported where appropriate.
Unless otherwise noted in the question, assume that parameters in method calls are not null and that 
methods are called only when their preconditions are satisfied.

In writing solutions for each question, you may use any of the accessible methods that are listed in 
classes defined in that question. Writing significant amounts of code that can be replaced by a call 
to one of these methods will not receive full credit.

This question involves the StringManip class, which is used to perform manipulation on strings.
The class provides the removeSpaces method, whose implementation is not shown. The method takes a 
string and returns a new string with spaces removed. For example, removeSpaces("hi how are you") 
returns "hihowareyou". The removeSpaces method will be used in part (b).

## Part A
(a) Write method reverseString, which takes a string str and returns a new string with the characters in str in reverse order.   
    For example, reverseString("ABCDE") should return "EDCBA".


## Part B
For this question, let a palindrome be defined as a string that, when spaces are removed, 
reads the same forward and backward. For example, "race car" and "taco cat" are palindromes. 
You will write method palindromeChecker, which determines whether a string is a palindrome and 
prints a message indicating the result. Examples of the intended behavior of the method are shown 
in the following table.

          Method Call	                         Printed Message
 palindromeChecker("taco cat")	           taco cat is a palindrome  
 palindromeChecker("laid on no dial")      laid on no dial is a palindrome  
 palindromeChecker("level up")	           level up is not a palindrome  
 
(b) Write method palindromeChecker. Assume that reverseString works as specified, regardless of what you wrote in part (a). 
    You must use reverseString and removeSpaces appropriately to receive full credit. 
    Your implementation must conform to the examples in the table.
