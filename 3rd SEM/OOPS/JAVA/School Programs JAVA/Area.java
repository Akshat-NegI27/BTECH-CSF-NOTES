import java.io.*;
public class Area extends Perimeter
{
   double h;
   double area;
   
   Area(double aa,double bb,double hh)
   {
       super(aa,bb);
       h=hh;
       area=0;
   }
   
   void doarea()
   {
       area = b*h;
   }
   
   void show()
   {
       super.show();
       System.out.println("Area==>"+area);
   }
   
   public static void main (String args []) throws IOException
   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Lenght==>");
        int aa1 = Integer.parseInt(br.readLine());
        System.out.println("Enter Breadth==>");
        int bb1 = Integer.parseInt(br.readLine());
        System.out.println("Enter Height==>");
        double hh1 = Double.parseDouble(br.readLine());
        
        Area w = new Area (aa1, bb1, hh1);
        w.doarea();
        w.show();
   }
}
