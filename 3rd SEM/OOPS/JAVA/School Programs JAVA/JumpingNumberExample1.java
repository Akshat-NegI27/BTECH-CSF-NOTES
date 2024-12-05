import java.util.*;  
public class JumpingNumberExample1  
{  
public static void main(String args[])  
{  
int num, difference=0;    
boolean flag = true;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
//reads an integer from the user  
num=sc.nextInt();  
//assigning num to n  
int n = num;  
//execute until the condition becomes false  
while(num != 0)  
{  
//determines the last digit from the given number      
int digit1 = num % 10;  
//removes the last digit   
num = num/10;  
//checks if the number is equal to 0 or not  
if(num != 0)  
{  
//if the above condition returns true  
//determines the second last digit from the number  
int digit2 = num % 10;  
//subtract the digits and finds the absolute value  
//after that checks if the difference of two adjacent digit is equal to 1 or not  
if(Math.abs(digit1 - digit2) != 1)  
{  
//if the difference is not equal to 1, set flag to false      
flag = false;  
//breaks the execution  
break;  
}//end of if 2nd statement   
}//end of if 1st statement   
}//end of while  
if(flag)  
System.out.println(n + " is a jumping number.");  
else  
System.out.println(n + " is not a jumping number.");  
}  
}  