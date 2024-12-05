import java.util.Scanner;
class MathOperations 
{
    public int add(int num1, int num2) 
    {
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3) 
    {
        return num1 + num2 + num3;
    }
    public double add(double num1, double num2) 
    {
        return num1 + num2;
    }
    
    public static void main(String[] args) 
    {
        MathOperations math = new MathOperations();
        int result1 = math.add(5, 10);
        System.out.println("Result 1: " + result1); 
        int result2 = math.add(5, 10, 15);
        System.out.println("Result 2: " + result2); 
        double result3 = math.add(2.5, 3.7);
        System.out.println("Result 3: " + result3); 
    }
}