//To find the Unique Numbers
import java.io.*;
public class Unique_Number
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ar1[] = new int[50];
        int ar2[] = new int[50];
        int a, b, c=0, ck,i,j, k, m, d=0, h=0;
        System.out.println("Enter the value of a and b to store integers between them");
        a =Integer.parseInt(br.readLine());
        b =Integer.parseInt(br.readLine());
        
        for(m=a; m<=b; m++)
        {
            ar1[d++]=m;
        }
        System.out.println("The Unique Integers between " +a+ " and " +b+ " are:");
        
        for(i=0; i<d; i++)
        {
            k=ar1[i];
            ck=0;
            while(k>0)
            {
                ar2[h++] = k%10;
                k=k/10;
            }
            
            for(j=0; j<h-1; j++)
            {
                for(k=j+1; k<h; k++)
                {
                    if(ar2[j]==ar2[k])
                    {
                        ck=1;
                        break;
                    }
                }//end of k loop
            }//end of j loop
            if(ck==0)
            {
                System.out.println(ar1[i]+" ");
                c++;
            }
            h=0;
        }//end of i loop
        System.out.println();
        System.out.println("The Frequency of Unique Digits are==>"+c);
    }//end of main funtion
}//end of class
