import java.util.Scanner;
class MyClass 
{
    private int value;
    public MyClass() 
    {
        value = 0;
    }
    
    public MyClass(int initialValue) 
    {
        value = initialValue;
    }

    public MyClass(int initialValue, int additionalValue) 
    {
        value = initialValue + additionalValue;
    }

    public int getValue() 
    {
        return value;
    }

    public static void main(String[] args) 
    {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(5);
        MyClass obj3 = new MyClass(10, 20);             
        System.out.println("Value of obj1: " + obj1.getValue()); 
        System.out.println("Value of obj2: " + obj2.getValue()); 
        System.out.println("Value of obj3: " + obj3.getValue()); 
    }
}