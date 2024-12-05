import java.io.*;
public class Deletetion_insertion
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[50];
        int n, pos;
        System.out.println("Enter the array Size==>");
        n = Integer.parseInt(br.readLine());
        System.out.println("Enter the array Elements==>");
        for(int i=0; i<n; i++)
        arr[i] = Integer.parseInt(br.readLine());
        
        System.out.println("Enter the Position of deletetion==>");
        pos = Integer.parseInt(br.readLine());
        
        //Deletetion of element
        for(int j=pos+1; j<n; j++)
        {
           arr[j-1] = arr[j];
           n--;
        }
        
        System.out.println("Array elements after deletetion==>");
        for(int i=0; i<n; i++)
        System.out.println(arr[i]);
}
}
