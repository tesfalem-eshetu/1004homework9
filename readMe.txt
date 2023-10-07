/*
     Tesfalem Eshetu
     te2320
     Fail2Ban.java  
*/

I have tried to approach this problem in a fairly simple way .
I have first tried read in the file input and use a .split method 
to change every line of the input file to a string array. but since array 
are less convenient I have changed that same array to an array list of 
strings which can be easily manipulated as they are more flexible.

from my new string array list i then look for the key word invalid and 
and if it happens to contain one i located the ip address and added it to an 
array list i create to store invalid ip address.
i then create my own method to check how many times a specific ip address
occurred in the invalid ip address array list. and if it occurred more than
3 time i will move it to a new array list of string containing duplicates
if has not already existed. for this i implemented nested if to check if the 
duplicate array list already contains the specific ip address.
i then use for loops implementation to iterate through my duplicate 
ip address array list and use the output function to write it on the the 
output file  
