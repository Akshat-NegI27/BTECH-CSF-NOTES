import java.io.*;
public class Matrix_Multiplication
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,m;
        System.out.println("Enter Rows and Columns of the Matrix=>");
        n= Integer.parseInt(br.readLine());
        m= Integer.parseInt(br.readLine());
        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        int c[][] = new int[n][m];

        System.out.println("Enter elements of Matrix A");
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter Row "+ (i+1) + " :");
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Enter elements of Matrix B");
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter Row "+ (i+1) + " :");
            for (int j = 0; j < n; j++) 
            {
                b[i][j] = Integer.parseInt(br.readLine());
            }
        }
        
        System.out.println("The Matrix Elements of A Matrix are==>");
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        
        System.out.println("The Matrix Elements of B Matrix are==>");
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            System.out.print(b[i][j]+"\t");
            System.out.println();
        }
        
        //Multiply the Matrices
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                for (int k = 0; k < 4; k++) 
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
                
            }
        }
        
        System.out.println("Output Matrix C:");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            System.out.print(c[i][j]+"\t");
            System.out.println();
        }
    }
}