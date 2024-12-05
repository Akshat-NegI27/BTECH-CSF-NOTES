import java.io.*;
public class magic
{
    int num[];
    int n;
    void Magic()
    {
        n=0;
    }
    
    void Magic(int nx)
    {
        n=nx;
    }
    
    void input_numbers(int x) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<n; i++)
        {
           num[i] = Integer.parseInt(br.readLine());
        }
        n = Integer.parseInt(br.readLine());
    }
    
    void find_print_magic()
    {
        int p=0;
        int s=0;
        int d;
        int sum =0;
        for (int i=0; i<n; i++)
        {
            while (p > 9)
            { 
                p = num[i];
                
                while (p>0)
                {
                    d=p%10;
                     sum = sum + d;
                    p=p/10;
                }
                p=s;
                
                if( sum == 1)
                {
                    System.out.println("It is a Magic Number");
                }
                else
                {
                    System.out.println("It is not a Magic Number");
                }
            }
        }
    }
    
    public static void main (String args []) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Number");
        int na=Integer.parseInt(br.readLine());
        magic m = new magic ();
        m.input_numbers(na);
        m.find_print_magic();
    }
}
