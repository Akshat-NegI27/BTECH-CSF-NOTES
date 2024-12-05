public class Decioct
{
    int n,oct;
    int d;
    Decioct ()
    {
        n=0;
        oct=0;
    }
    
    void getnum (int nn)
    {
        n=nn;
    }
    
    void deci_oct()
    {
        if(n>8)
        {
            n= n/8;
            deci_oct();
        }
        d = n % 8;
        oct = oct * 10 + d;
    }
    
    void show ()
    {
        System.out.println("Number"+n);
        deci_oct();
        System.out.println("Octal Equivalent ="+ oct);
    }
    
    public static void main (String args[])
    {
        Decioct d1 = new Decioct();
        d1.getnum(100);
        d1.show();
    }
}