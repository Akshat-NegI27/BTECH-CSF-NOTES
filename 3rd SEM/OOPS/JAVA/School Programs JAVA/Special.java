public class Special
{
    int n;
    Special()
    {
        n=0;
    }
    
    Special(int a)
    {
        n = a;
    }
    
    void sum ()
    {
        int n1 = n;
        int r = 0;
        if (n > 9)
        {
            while (n1 != 0)
            {
                r = r * 10 + (n1 % 10);
                n1 = n1 / 10;
            }
            int sum = n % 10 + r % 10;
        }
    }
    
    void isSpecial ()
    {
        int n1 = n;
        int sum = 0;
        while (n1 != 0)
        {
            int f = 1;
            int i = 1;
            for (i=1; i<=n%10; i++)
            {
                f = f*i;
            }
            sum = sum + f;
            n1 = n1 / 10;
        }
        if (sum == n)
        {
            System.out.println("No. is Special!");
        }
        else
        System.out.println("No. is Special");
    } 
}