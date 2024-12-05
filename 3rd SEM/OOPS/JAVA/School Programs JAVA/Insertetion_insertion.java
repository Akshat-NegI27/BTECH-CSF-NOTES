import java.io.*;
public class Insertetion_insertion
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[50];
        int n, pos,ele;
        System.out.println("Enter the array Size==>");
        n = Integer.parseInt(br.readLine());
        System.out.println("Enter the array Elements==>");
        for(int i=0; i<n; i++)
        arr[i] = Integer.parseInt(br.readLine());
        
        System.out.println("Enter the array Element to be inserted==>");
        ele = Integer.parseInt(br.readLine());
        
        System.out.println("Enter the Position of insertion==>");
        pos = Integer.parseInt(br.readLine());
        
        //Insertion of element
        for(int j=n-1; j>=pos; j--)
        arr[j+1]=arr[j];
        arr[pos] = ele;
        
        System.out.println("Array elements after insertion==>");
        for(int i=0; i<n+1; i++)
        System.out.println(arr[i]);
    }
}
