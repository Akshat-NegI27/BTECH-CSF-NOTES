import java.io.*;
public class Record
{
    int rank[];
    String name[];
    
    Record ()
    {
        name = new String[10];
        rank = new int [10];
    }
    
    void read_values () throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Names=>");
        for (int i=0; i< 10; i++)
        {
            name[i] = br.readLine();
        }
        System.out.println("Enter The Ranks=>");
        for(int i=0; i< 10; i++)
        {
            rank[i]= Integer.parseInt(br.readLine());
        }
    }
    
    void display()
    {
        for(int i =0 ; i<10; i++)
        {
        System.out.println(name[i]);
        System.out.println(rank[i]);
        }
    }
}
