import java.util.Scanner;
class Sumeodigit 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int num = scanner.nextInt();
        int sed = 0, sod = 0;

        while (num > 0) 
        {
            int digit = num % 10; 
            if (digit % 2 == 0) 
            {
                sed += digit;
            } 
            else 
            {
                sod += digit;
            }
            num /= 10;
        }
        System.out.println("Sum of even digits: " + sed);
        System.out.println("Sum of odd digits: " + sod);
    }
}
