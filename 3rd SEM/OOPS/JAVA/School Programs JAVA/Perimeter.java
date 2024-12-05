public class Perimeter
{
  double a; double b;
  double perimeter=0.0;
  
  Perimeter(double aa,double bb)
  {
      a=aa;
      b=bb;
  }
  
  double calculate()
  {
      perimeter = 2*(a+b);
      return perimeter;
  }
  
  void show()
  {
      double n= calculate();
      System.out.println("Perimeter==>"+n);
      System.out.println("Lenght==>"+a);
      System.out.println("Breadth==>"+b);
  }
}