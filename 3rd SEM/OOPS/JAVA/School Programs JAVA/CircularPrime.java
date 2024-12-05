import java.io.*;
class CircularPrime
{
    public static void main(String args[])
    throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("N = ");
        int n = Integer.parseInt(br.readLine());
        String s = Integer.toString(n);
        int len = s.length();
        boolean status = true;
        for(int i = 1; i <= len; i++)
        {
            if(!isPrime(n))
                status = false;
            System.out.println(n);
            s = s.substring(1) + s.charAt(0);
            n = Integer.parseInt(s);
        }
        if(status)
            System.out.println(n + " IS A CIRCULAR PRIME.");
        else
            System.out.println(n + " IS NOT A CIRCULAR PRIME.");
    }
    public static boolean isPrime(int num)
    {
        int f = 0;
        for(int i = 1; i <= num; i++)
            if(num % i == 0)
                f++;
        return (f == 2);
    }
}