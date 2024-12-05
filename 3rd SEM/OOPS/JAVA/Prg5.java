import java.util.Scanner;
class GetInputFromcust
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
				System.out.println("Enter Your Name: ");
		String s = in.nextLine();
				System.out.println("Enter Your Age: ");
		int a = in.nextInt();
				System.out.println("Enter Your Bill Amount: ");
		float b = in.nextFloat();
		System.out.println("Your Name: " + s);
		System.out.println("Your Age: " + a);
		System.out.println("Your Amount: " + b);
	}
}
