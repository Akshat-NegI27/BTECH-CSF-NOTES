import java.io.*;
public class Disarium
{
    int num, size;
    
    Disarium (int nn)
    {
        num = nn;
        size = 0;
    }
    
    void countDigit ()
    {
        int a = num;
        while (a!=0)
        {
            a = a / 10;
            size ++;
        }
    }
    
    int sumofDigits (int n, int p)
    {
        if (n == 0)
        return 0;
        else 
        return (int)Math.pow(n%10,p) + sumofDigits ((n/10),p-1);
    }
    
    void check ()
    {
        int d = sumofDigits(num,size);
        if (num == d)
        {
            System.out.println("Number is Disarium");
        }
        else
        System.out.println("Number is not Disarium");
    }
    
    public static void main (String args[]) throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the Number");
    int n = Integer.parseInt(br.readLine());
    Disarium d1 = new Disarium (n);
    d1.countDigit();
    d1.check();
    }
}
