class player
{
String name;
int age;
player(String n,int a)
{
name=n; age=a;
}
void show()
{
System.out.println("\n");
System.out.println("Player name : "+name);
System.out.println("Age : "+age);
}
}
class cricket_player extends player
{
String type;
cricket_player(String n,String t,int a)
{
super(n,a);
type=t;
}
public void show()
{
super.show();
System.out.println("Player type : "+type);
}
}
class football_player extends player
{
String type;
football_player(String n,String t,int a)
{
super(n,a);
type=t;
}
public void show()
{
super.show();
System.out.println("Player type : "+type);
}
}
class hockey_player extends player
{
String type;
hockey_player(String n,String t,int a)
{
super(n,a);
type=t;
}
public void show()
{
super.show();
System.out.println("Player type : "+type);
}
}
class exp_5_Q2
{
public static void main(String args[])
{
cricket_player c=new cricket_player("Akshu","Cricket",25);
football_player f=new football_player("Yogi","Football",15);
hockey_player h=new hockey_player("Mahi","Hockey",29);
c.show();
f.show();
h.show();
        System.out.println ("Akshat Negi");
        System.out.println ("500106533");
        System.out.println ("R2142220414");
    }
}
