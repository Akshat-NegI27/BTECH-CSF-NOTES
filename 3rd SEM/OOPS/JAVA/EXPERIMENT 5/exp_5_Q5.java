class Rectangle 
{
private int length;
private int breadth;
public Rectangle(int side) 
{
length = side;
breadth = side;
}
public Rectangle(int l, int b) 
{
length = l;
breadth = b;
}
public int getArea() 
{
return length * breadth;
}
}
class exp_5_Q5
{
public static void main(String[] args) 
{
Rectangle rect = new Rectangle(6, 3);
Rectangle sq = new Rectangle(8);
System.out.println(rect.getArea());
System.out.println(sq.getArea());
        System.out.println ("Akshat Negi");
        System.out.println ("500106533");
        System.out.println ("R2142220414");
    }
}
