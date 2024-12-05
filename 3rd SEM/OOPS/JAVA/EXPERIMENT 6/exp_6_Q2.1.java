// Java program to implement the interface 
// with multi-level inheritance

interface com 
{
  void hello();
}

class Sam1 implements com 
{
  public void hello() 
  {
    System.out.println("Hello World");
  }
}

class Sam2 extends Sam1 
{
  public void hello1() 
  {
    System.out.println("Hello World1");
  }
}

class Sam3 extends Sam2 
{
  public void hello2() 
  {
    System.out.println("Hello World2");
  }
}
class Main 
{
  public static void main(String[] args) 
  {
    Sam3 S = new Sam3();
    S.hello();
    S.hello1();
    S.hello2();
    	  System.out.println ("Akshat Negi");
        System.out.println ("500106533");
        System.out.println ("R2142220414");

  }
}