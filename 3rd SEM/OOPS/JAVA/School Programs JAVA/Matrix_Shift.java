import java.io.*;
public class Matrix_Shift
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of rows (m): ");
        int m = Integer.parseInt(br.readLine());
        System.out.print("Enter number of columns (n): ");
        int n = Integer.parseInt(br.readLine());
        
        int arr[][] = new int[m][n];
        int newArr[][] = new int[m][n];
        
        System.out.println("Enter array elements");
        for (int i = 0; i < m; i++) 
        {
            System.out.println("Enter Row "+ (i+1) + " :");
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        
        System.out.println("Input Array:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        for (int j = 0; j < n; j++) 
        {
            int col = j + 1;
            if (col == n) 
            {
                col = 0;
            }
            for (int i = 0; i < m; i++) 
            {
                newArr[i][col] = arr[i][j]; 
            }
        }
        
        System.out.println("New Shifted Array:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(newArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}