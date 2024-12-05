import java.io.*;
public class Rank extends Record
{
  int index;int h;
  
  Rank(int hrs1, int rate1, String na1, double basic1)
  {
      super();
      index=0;
  }
  
  void highest()
  {
      
      index = rank [10];
      for (int i=0; i< 10; i++)
      {
          if(h > rank[0])
          {
              h=rank[i];
              index=i;
          }
      }
  }
  
  void display()
  {
      super.display();
      System.out.println("Top Most rank==>"+name[index]);
      System.out.println("rank==>"+rank[index]);
  }
  
  public static void main (String args[]) throws IOException
  {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Name=>");
        String na1=br.readLine();
        System.out.println("Enter The Hours=>");
        int hrs1 = Integer.parseInt(br.readLine());
        System.out.println("Enter The Rate=>");
        int rate1 = Integer.parseInt(br.readLine());
        System.out.println("Enter The Basic Pay=>");
        double basic1 = Double.parseDouble(br.readLine());
        
        Rank w = new Rank (hrs1, rate1, na1, basic1);
        w.display();
  }
}
