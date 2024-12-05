class Euler
{
    public static void main(String args[])
    {
        double e = 0.0;
        int i = 0;
        while(true)
        {
            double temp = e;
            e += 1.0 / fact(i);
            if(e - temp < 0.0000001)
                break;
            i++;
        }
        System.out.println("e = " + e);
    }
    public static long fact(int n)
    {
        long f = 1L;
        for(int i = 1; i <= n; i++)
            f *= i;
        return f;
    }
}