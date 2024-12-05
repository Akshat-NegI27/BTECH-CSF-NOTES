import java.io.*;
public class Matrix_Circular
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the matrix: ");
        int n = Integer.parseInt(br.readLine());
        int x = 1;
        int arr[][] = new int[n][n];
        
        int a = 0;
        int b = n - 1;
        
        while (a < n) 
        {
            for (int i = a; i <= b; i++) 
            {
                arr[i][a] = x++;
            }
            a++;
            for (int i = a; i <= b; i++) 
            {
                arr[b][i] = x++;
            }
            
            for (int i = b - 1; i >= a - 1; i--) 
            {
                arr[i][b] = x++;
            }
            b--;
            for (int i = b; i >= a; i--) 
            {
                arr[a-1][i] = x++;
            }
        }
        
        System.out.println("Circular Matrix Anti-Clockwise:");
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}