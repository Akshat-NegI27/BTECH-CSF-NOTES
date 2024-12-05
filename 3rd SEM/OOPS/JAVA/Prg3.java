import java.util.Scanner;
class Calculator 
{
    public static void main(String args[]) 
    {
        int a, b, sum, diff, prod, quo, rem;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        sum = a + b;
        diff = a - b;
        prod = a * b;
        quo = a / b;
        rem = a % b;
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Quotient = " + quo);
        System.out.println("Remainder = " + rem);
    }
    }