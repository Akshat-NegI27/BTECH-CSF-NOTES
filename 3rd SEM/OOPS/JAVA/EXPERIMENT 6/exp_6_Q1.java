interface A
{
void meth1();
void meth2();
}

class MyClass implements A
{
    public void meth1()
        {
            System.out.println("Implemented meth1()");
        }
    public void meth2()
        {
            System.out.println ("Implemented meth2()");
        }
    public static void main(String arg[])
    {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        System.out.println ("Akshat Negi");
        System.out.println ("500106533");
        System.out.println ("R2142220414");
    }
}
