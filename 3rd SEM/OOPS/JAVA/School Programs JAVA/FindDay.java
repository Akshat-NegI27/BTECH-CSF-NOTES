import java.io.*;
class FindDay
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n, day, year, i, p, k=0;
        int ar[]={0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        String br[]={"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.print("Day Number:");
        day = Integer.parseInt(in.readLine());
        System.out.print("Year:");
        year = Integer.parseInt(in.readLine());
        System.out.print("Date After (N Days): ");
        n = Integer.parseInt(in.readLine());
        p = day + n;
        int a = 1, b = 1, date = 0, nday = 0, year1 = year;
        if(year % 4 == 0)
        {
            for(i = 2; i <= 12; i++)
            {
                ar[i] += 1;
            }
            if(day >= 1 && day <= 366)
            {
                for(i = 0; i <= 12; i++)
                {
                    if(ar[i] < day)
                        a = i;
                    if(ar[i] > day)
                        break;
                }
                date = day - ar[a];
            }
            else
                k = 1;
            if(k == 1)
                System.out.println("Days are out of Range");
            else if(k != 1 && n >= 1 && n <= 100)
            {
                if(p > ar[12])
                {
                    p = p - ar[12];
                    year1 = year1 + 1;
                }
                for(i = 0; i <= 12; i++)
                {
                    if(ar[i] < p)
                        b = i;
                    if(ar[i] > p)
                        break;
                }
                nday = p - ar[b];
            }
            else
            {
                k = 1;
                System.out.println("N Days are out of range ");
            }
            if(k != 1)
            {
                System.out.println("Date is : " + date + "th " + br[a + 1] + " " + year);
                System.out.println("Date After (N Days) is : "+ nday + "th " + br[b + 1] + " " + year1);
            }
        }
        else{
            if(day >=1 && day <= 365)
            {
                for(i = 0; i <= 12; i++)
                {
                    if(ar[i] < day)
                        a = i;
                    if(ar[i] > day)
                        break;
                }
                date = day - ar[a];
            }
            else
                k = 1;
            if(k == 1)
                System.out.println("Days are out of Range");
            if(n >= 1 && n <= 100)
            {
                if(p > ar[12])
                {
                    p = p - ar[12];
                    year1 = year1 + 1;
                }
                for(i = 0; i <= 12; i++)
                {
                    if(ar[i] < p)
                    {
                        b = i;
                    }
                    if(ar[i] > p)
                        break;
                }
                nday = p - ar[b];
            }
            else
            {
                k = 1;
                System.out.println("N days are out of range ");
            }
            if(k != 1)
            {
                System.out.println("Date is : "+date+"th " + br[a+1]+" "+year);
                System.out.println("N Date is : "+nday+"th " + br[b+1]+" "+year1);
            }
        }
    }
}