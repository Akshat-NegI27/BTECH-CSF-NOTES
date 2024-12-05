import java.io.*;
class Evil
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("N = ");
        int n = Integer.parseInt(br.readLine());
        if(n < 3 || n > 99)
        {
            System.out.println("NUMBER OUT OF RANGE");
            return;
        }
        int bin = convert(n);
        int c = count(bin);
        System.out.println("Binary equivalent = " + bin);
        System.out.println("Number of 1s = " + c);
        if(c % 2 == 0)
            System.out.println("EVIL NUMBER");
        else
            System.out.println("NOT AN EVIL NUMBER");
    }
    public static int convert(int n)
    {
        if(n <= 1)
            return n;
        else
            return convert(n / 2) * 10 + n % 2;
    }
    public static int count(int b)
    {
        if(b <= 0)
            return 0;
        else if(b % 10 == 1)
            return 1 + count(b / 10);
        else
            return 0 + count(b / 10);
    }
}
