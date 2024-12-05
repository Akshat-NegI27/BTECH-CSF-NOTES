class employee
{
int empid;
String name;
double salary;
employee()
{
empid=500106533;
name="Akshu";
salary=90000;
}
employee(String name,int empid,double salary)
{
this.empid=empid;
this.name=name;
this.salary=salary;
}
String getName()
{
return name;
}
double getSalary()
{
return salary;
}
double increaseSalary(double x)
{
salary=salary+(salary*x);
return salary;
}
}
class manager extends employee
{
double r=0.5;
manager()
{
super();
}
manager(String name, int empid, double salary)
{
super(name,empid,salary);
salary= increaseSalary(r);
}
}
class exp_5_Q4
{
public static void main(String[] args)
{
manager m=new manager("Akshu" , 500106533 , 150000);
System.out.println("NAME:" +m.name);
System.out.println("ID:" +m.empid);
System.out.println("Salary:" +m.salary);
        System.out.println ("Akshat Negi");
        System.out.println ("500106533");
        System.out.println ("R2142220414");
    }
}
