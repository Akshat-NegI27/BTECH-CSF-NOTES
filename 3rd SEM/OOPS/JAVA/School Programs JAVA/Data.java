import java.io.*;
interface Data
{
    
    final double pi = 3.142;
    double volume();
}
class Base
{
    double rad;
    public Base(double r)
    {
        rad = r;
    }
    public void show()
    {
        System.out.println("Radius: " + rad);
    }
}
class CalVol extends Base implements Data
{
    double ht;
    public CalVol(double r, double h)
    {
        super(r);
        ht = h;
    }
    public double volume()
    {
        return pi * rad * rad * ht;
    }
    public void show()
    {
        super.show();
        System.out.println("Height: " + ht);
        double v = volume();
        System.out.println("Volume of cylinder: " + v);
    }
}
class Solve
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Radius of cylinder: ");
        double r = Double.parseDouble(br.readLine());
        System.out.print("Height of cylinder: ");
        double h = Double.parseDouble(br.readLine());
        CalVol obj = new CalVol(r, h);
        obj.show();
    }
}