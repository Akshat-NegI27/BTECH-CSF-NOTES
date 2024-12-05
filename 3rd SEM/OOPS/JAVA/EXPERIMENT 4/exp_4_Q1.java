import java.util.Scanner;
class MyClass 
{
    private int data;
    public void setData(int value)
    {
        data = value;
    }
    public int getData() 
    {
        return data;
    }
    
    public static void main(String[] args) 
    {
        MyClass myObject = new MyClass();
        myObject.setData(42);
        int retrievedData = myObject.getData();
        System.out.println("Data retrieved from the object: " + retrievedData);
    }
}