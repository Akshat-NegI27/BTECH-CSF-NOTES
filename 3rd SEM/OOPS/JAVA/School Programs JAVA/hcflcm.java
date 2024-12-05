import java.util.Scanner;
import java.util.*;
public class hcflcm
{
static int i,min,max,lcm=1,r=0,hcf,x;

public void hcf(int a,int b)
{
if(a>b)
{
max=a;
min=b;
}
else
{
max=b;
min=a;
}
 while(max%min != 0)
 {
 r =max%min;
 max=min;
 min= r;
 }
 
 System.out.println("H.C.F. result="+r);

}
public void lcm(int a,int b)
 {
 if(a>b)
{
max=a;
min=b;
}
else
{
max=b;
min=a;
}
 
/*
To find the maximum and minimum numbers, you can also use
int max=a>b?a:b;
int min=a<b?a:b;
*/
 
for(int i=1;i<=min;i++)
 {
 x=max*i; //finding multiples of the maximum number
 if(x%min==0) //Finding the multiple of maximum number which is divisible by the minimum number.
 {
 lcm=x; //making the 1st multiple of maximum number as lcm, which is divisible by the minimum number
 break; //exiting from the loop, as we don’t need anymore checking after getting the LCM
 }
 }
System.out.println("L.C.M. = "+lcm);
 
 }

public static void main(String[] args){ 
 Scanner user_input = new Scanner(System.in);
 System.out.println("Enter lower 1st number");
 int l= user_input.nextInt();
 System.out.println("Enter Upper 2nd number");
 int u= user_input.nextInt();
 hcflcm obj=new hcflcm();
 obj.hcf( l, u);
 obj.lcm(l, u); 
 
 }}
