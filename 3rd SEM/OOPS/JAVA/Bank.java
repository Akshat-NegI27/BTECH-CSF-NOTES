import java.util.*;
class cal
{
int bal;
String name;
int acc_num;

cal()
{
bal=0;
}

void deposit(int x)
{
bal+=x;
}

void withdraw(int x)
{
if(x>bal)
System.out.println("insufficient balance");
else
bal-=x;
}

void display()
{
System.out.println("Name : \t"+name);
System.out.println("Account number  : \t"+acc_num);
System.out.println("Balance : \t"+bal);
}



public static void main(String arg[])
{
Scanner sc=new Scanner (System.in);
cal ob=new cal();
System.out.println("Enter the name");
ob.name=sc.nextLine();
System.out.println("Enter the acc num");
ob.acc_num=sc.nextInt();
int n,a;
while(true)
{
System.out.println(" Press 1 to depost \n Press 2 to withdraw \n Press 3 to display details\n Press 5 to exit");
n=sc.nextInt();
if(n==1)
{
System.out.println("Enter the amount ");
a=sc.nextInt();
ob.deposit(a);
ob.display();
}
if(n==2)
{
System.out.println("Enter the amount ");
a=sc.nextInt();
ob.withdraw(a);
ob.display();
}
if(n==3)
{
ob.display();
}
if(n==5)
{
break;
}
}
}
}
