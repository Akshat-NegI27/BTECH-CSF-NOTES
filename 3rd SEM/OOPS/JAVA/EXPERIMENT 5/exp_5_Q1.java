class room
{
private int l,b;
room(int x,int y)
{
l=x; b=y;
}
int area()
{
return(l*b);
}
}
class class_room extends room
{
int h;
class_room(int x,int y,int z)
{
super(x,y);
h=z;
}
int volume()
{
return(area()*h);
}
}
class exp_5_Q1
{
public static void main(String args[])
{
class_room cr=new class_room(18,45,55);
int a1=cr.area();
int v1=cr.volume();
System.out.println("Area of Room : "+a1);
System.out.println("Volume of Room : "+v1);
        System.out.println ("Akshat Negi");
        System.out.println ("500106533");
        System.out.println ("R2142220414");
    }
}
