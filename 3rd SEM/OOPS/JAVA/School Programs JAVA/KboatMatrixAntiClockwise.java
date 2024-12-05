import java.io.*;
public class KboatMatrixAntiClockwise
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the matrix: ");
        int n = Integer.parseInt(br.readLine());

        if (n % 2 == 0) 
        {
            System.out.println("Invalid Input! Size must be an odd number");
            return;
        }
        
        int val  = 1;
        int arr[][] = new int[n][n]; 

        int x = n / 2;
        int y = n / 2;
        int d = 1;
        int c = 0;
        int s = 1;
        
        for (int k = 1; k <= (n - 1); k++) 
        {
            for (int j = 0; j < (k < n - 1 ? 2 : 3); j++) 
            {
                for (int i = 0; i < s; i++) 
                {
                    arr[x][y] = val++;
                    
                    switch (d) 
                    {
                        case 0:
                        y = y - 1;
                        break;
                        
                        case 1:
                        x = x + 1;
                        break;
                        
                        case 2:
                        y = y + 1;
                        break;
                        
                        case 3:
                        x = x - 1;
                        break;
                    }
                }
                d = (d + 1) % 4;
            }
            s = s + 1;
        }
        arr[n-1][0] = val;
        System.out.println("Circular Matrix AntiClockwise:");
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