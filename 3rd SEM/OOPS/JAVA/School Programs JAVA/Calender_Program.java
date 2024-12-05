import java.io.*;
class Calender_Program
{
    public static void main(String args[])throws IOException
    {      
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int year;
         String month;
         String day;
         String months[] = {"","January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November", "December"};
           int D[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
           String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", 
                            "Saturday"};
         System.out.println("Enter the year:");
         year=Integer.parseInt(br.readLine());
         System.out.println("Enter the month:");
         month=br.readLine();
         System.out.println("Enter the 1st day of "+month+":");
         day=br.readLine();
         
        if((year%400==0) ||((year%100!=0)&&(year%4==0)))
        {
            D[2]=29;
        }
        int max=0;
        for(int i=1; i<=12; i++)
        {
            if(month.equalsIgnoreCase(months[i]))
            {
                max = D[i];  //Saving maximum day of given month
            }
        }

                            
         int f = 0;
        for(int i=0; i<7; i++)
        {
            if(day.equalsIgnoreCase(days[i]))
            {
                f = i;  //Saving week day no. given day (e.g. '0' for Sunday)
            }
        }
        int A[][] = new int[6][7];
        int x = 1, z = f;
        for(int i=0;i<6;i++)
        {
            for(int j=f; j<7; j++)
            {
                if(x<=max)
                {
                    A[i][j] = x;
                    x++;
                }
            }
            f = 0;
        }
        for(int j=0; j<z; j++) //Adjustment to bring last (6th) row elements to first row
        {
            A[0][j]=A[5][j];
        }    
        System.out.println("\n\t----------------------------------------------------");
        System.out.println("\t\t\t   "+month+" "+year); 
        System.out.println("\t----------------------------------------------------"); 
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        System.out.println("\t----------------------------------------------------"); 
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                if(A[i][j]!=0)
                    System.out.print("\t "+A[i][j]);
                else
                    System.out.print("\t ");
            }
            System.out.println("\n\t----------------------------------------------------"); 
        }
    }
}