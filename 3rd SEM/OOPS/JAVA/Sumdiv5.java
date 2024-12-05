public class Sumdiv5
{
    public static void main(String[] args) 
    {
        int soi = 0;
        for (int n = 41; n < 250; n++) 
        {
            if (n % 5 == 0) 
            {
                soi += n;
            }
        }
        System.out.println("The sum of integers greater than 40 and less than 250 that are divisible by 5 is: " + soi);
    }
}
