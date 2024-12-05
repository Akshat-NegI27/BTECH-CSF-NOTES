import java.io.*;
public class Purchase extends Stock
{
   int pqty, prate;
   
   Purchase(String item, int quantity, int rate, int purchased_quantity, int purchased_item)
   {
       super(item, quantity, rate);
       pqty=purchased_quantity;
       prate=purchased_item;
   }
   
   void update()
   {
       amt=pqty*prate;
   }
   
   void display()
   {
       System.out.println("Before Update=>");
       super.display();
       System.out.println("After Update=>");
       System.out.println("Quantity=>"+pqty);
       System.out.println("Rate=>"+prate);
       System.out.println("Amount=>"+amt);
   }
   
   public static void main (String args[])throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Enter the Item=>");
       String ite1 =br.readLine();
       System.out.println("Enter the Quantity=>");
       int qyt1 = Integer.parseInt(br.readLine());
       System.out.println("Enter the Rate=>");
       int rat1 = Integer.parseInt(br.readLine());
       
       System.out.println("Enter the New Quantity=>");
       int qytup = Integer.parseInt(br.readLine());
       System.out.println("Enter the New Rate=>");
       int ratup = Integer.parseInt(br.readLine());
       
       Purchase w = new Purchase (ite1, qyt1, rat1,qytup,ratup);
       w.update();
       w.display();
   }
}
