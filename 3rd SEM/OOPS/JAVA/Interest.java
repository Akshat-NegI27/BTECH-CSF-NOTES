import java.util.Scanner;
class Interest
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double p = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double r = scanner.nextDouble();

        r /= 100;

        System.out.print("Enter the time period (in years): ");
        double t = scanner.nextDouble();

        double si = (p * r * t);
        System.out.println("Simple Interest: " + si);
      }
}
