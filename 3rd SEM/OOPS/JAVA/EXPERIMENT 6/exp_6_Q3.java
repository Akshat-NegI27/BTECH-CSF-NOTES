interface course
{
void division(int a);
void modules(int b);
}

class une implements course
{
String name;
int div,mod;
void name(String n)
{ name=n; }

public void division(int a)
{ div=a; }

public void modules(int b)
{ mod=b; }

void disp()
{
System.out.println("Name: "+name);
System.out.println("Division: "+div);
System.out.println("Modules: "+mod);
}
}

class run
{
public static void main(String args[])
{ 
une s=new une();
s.name("Akshat");
s.division(4);
s.modules(15);
s.disp();
System.out.println ("Akshat Negi");
        System.out.println ("500106533");
        System.out.println ("R2142220414");

}
}