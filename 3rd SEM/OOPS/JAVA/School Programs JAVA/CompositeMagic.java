import java.io.*;
class CompositeMagic
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("m = ");
        int m = Math.abs(Integer.parseInt(br.readLine()));
        System.out.print("n = ");
        int n = Math.abs(Integer.parseInt(br.readLine()));
        if(m >= n)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        int count = 0;
        System.out.println("THE COMPOSITE MAGIC INTEGERS ARE:");
        for(int i = m; i <= n; i++)
        {
            if(isComposite(i) && isMagic(i))
            {
                if(count == 0)
                    System.out.print(i);
                else
                    System.out.print(", " + i);
                count++;
            }
        }
        System.out.println("\nFREQUENCY OF COMPOSITE MAGIC INTEGERS IS: " + count);
    }
    public static boolean isComposite(int num)
    {
        int f = 0;
        for(int i = 1; i <= num; i++)
            if(num % i == 0)
                f++;
        return f > 2;
    }
    public static boolean isMagic(int num)
    {
        while(num > 9)
        {
            num = sumOfDigits(num);
        }
        return num == 1;
    }
    public static int sumOfDigits(int num)
    {
        int sum = 0;
        while(num != 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}