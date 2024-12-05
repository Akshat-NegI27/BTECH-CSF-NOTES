import java.io.*;
public class Wages extends worker
{
    int hrs, rate, wage=0; double ov=0.0;
    
    Wages(int h, int r, String na, double ba)
    {
        super(na, ba);
        hrs= h;
        rate=r;
        
    }
    
    double overtime()
    {
        ov= hrs * rate;
        return ov;
    }
    
    void display()
    {
        double amount = overtime();
        super.display();
        System.out.println("Wage=>"+wage);
        System.out.println("Hrs=>"+hrs);
        System.out.println("Rate=>"+rate);
        System.out.println("Amount=>"+amount);
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
        
        Wages w = new Wages (hrs1, rate1, na1, basic1);
        w.display();
        
    }
}
