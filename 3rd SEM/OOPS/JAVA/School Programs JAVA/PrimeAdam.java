import java.io.*;
class PrimeAdam
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("m = ");
        int m = Integer.parseInt(br.readLine());
        System.out.print("n = ");
        int n = Integer.parseInt(br.readLine());
        if(m >= n)
        {
            System.out.println("Invalid input.");
            return;
        }
        int count = 0;
        System.out.println("The Prime-Adam integers are:");
        for(int i = m; i <= n; i++)
        {
            if(isPrime(i))
            {
                int rev = reverse(i);
                int s1 = i * i;
                int s2 = rev * rev;
                if(reverse(s1) == s2)
                {
                    if(count == 0)
                        System.out.print(i);
                    else
                        System.out.print(", " + i);
                    count++;
                }
            }
        }
        if(count == 0)
            System.out.println("NIL");
        else
            System.out.println();
        System.out.println("Frequency of Prime-Adam integers is: " + count);
    }
    public static boolean isPrime(int n)
    {
        int f = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                f++;
        }
        return f == 2;
    }
    public static int reverse(int n)
    {
        int rev = 0;
        for(int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;
        return rev;
    }
}