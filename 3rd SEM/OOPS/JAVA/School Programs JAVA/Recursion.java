import java.io.*;
public class Recursion
{
    int a, b, c, limit;
    
    Recursion()
    {
        a=0;
        b=1;
        c=1;
    }
    
    void input()throws IOException
    {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Limit");
            limit = Integer.parseInt(br.readLine());
    }
    
    int fib (int n)
    {
        if (n==1)
            return 0;
        else if (n==2)
            return 1;
        else
            return (fib(n-1)+ fib(n-2));
    }
    
    void generate_fibseries ()
    {
        int x = 1;
        while (x<=limit)
        {
            c = fib (x);
            System.out.println(c);
            x++;
        }
    }
    
    public static void main (String args[]) throws IOException
    {
        Recursion r = new Recursion();
        r.input();
        r.generate_fibseries();
    }
}