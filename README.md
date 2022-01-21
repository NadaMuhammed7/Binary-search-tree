# Binary-search-tree

Given a set of N elements that contain exactly X distinct elements (while the rest are repetitions), the redundancy ratio is defined as the ratio N/X. 

You are supposed to write a program to input a set of integers, and keep track of the 

redundancy ratio. Once the redundancy ratio reaches or exceeds a specific value r, the 

program terminates and prints this ratio with a message indicating that your numbers have 

“many repetitions”. If you want to force the program to terminate before the redundancy 

ratio reaches r, you can input -1 as your input integer. In this case, the program prints the

current ratio with a message indicating that your numbers have “only few repetitions”. 

 
Input format: 
First line contains the redundancy ratio r as a real number greater than 1. 

Next lines contain integers one per line. 

 Output format: 
 
Print the required answer. 
 
Sample input 1 

 1.5 
1 
4 
2 
5 
2 
2 
 
 
Sample output 1 

ratio=6/4=1.5 

many repetitions

Sample input 2 

 1.2 
1 
2 
4 
5 
1 
 
 
 
Sample output 2 

ratio=5/4=1.25 

many repetitions 
 
 
Sample input 3 
 2.0 
4 
6 
8 
2 
5 
5 
2 
-1 
Sample output 3 

ratio=7/5=1.4 

only few repetitions 
