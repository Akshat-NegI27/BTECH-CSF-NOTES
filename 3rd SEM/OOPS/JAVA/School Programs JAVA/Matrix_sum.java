import java.io.*;
public class Matrix_sum
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m, i, j, s;
        System.out.println("Enter Rows and Columns of the Matrix=>");
        n= Integer.parseInt(br.readLine());
        m= Integer.parseInt(br.readLine());
        int a[][]=new int[n+1][m+1];
        System.out.println("Enter the Matrix Elements==>");
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            a[i][j]=Integer.parseInt(br.readLine());
        }
        
        System.out.println("The Matrix Elements are==>");
        
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        
        for(i=0; i<m; i++)
        {   
            s=0;
            for(j=0; j<n; j++)
            s=s+a[i][j];
            a[n][i]=s;
        }
        
        System.out.println(" Matrix with sum of rows and columns Elements are==>");
        for(i=0; i<n+1; i++)
        {
            for(j=0; j<m+1; j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}
