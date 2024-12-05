public class worker
{
   double basic; 
   String name;
   worker(String na, double ba)
   {
       name = na;
       basic = ba;
   }
   
   void display()
   {
       System.out.println("Worker name"+name);
       System.out.println("Worker Basic Pay"+basic);
   }
}
