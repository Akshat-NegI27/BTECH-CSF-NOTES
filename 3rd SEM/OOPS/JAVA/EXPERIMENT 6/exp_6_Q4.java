interface Test 
{
    int square(int num);
}

class Arithmetic implements Test 
{
public int square (int num) 
{
return num*num;
}
}

class ToTestInt 
{
public static void main(String[] args) 
{
    Arithmetic a = new Arithmetic(); 
    int number = 10;
    int result = a.square(number);
System.out.println("Square of " + number + " is: " + result);
}
}

class Main 
{
public static void main(String[] args) 
{
    ToTestInt.main(args);
System.out.println ("Akshat Negi");
        System.out.println ("500106533");
        System.out.println ("R2142220414");

}
}