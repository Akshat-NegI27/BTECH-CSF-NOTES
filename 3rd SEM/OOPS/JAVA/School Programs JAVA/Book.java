public class Book
{
    String name[];
    int point,max;
    Book(int cap)
    {
        max=cap;
        point=-1;
        name=new String[max];
    }
    
    void tell()
    {
        if(point< 0)
        {
            System.out.println("SHELF EMPTY");
        }
        else
        {
            System.out.println(name[point]);
        }
    }

    void add(String v)
    {
        if(point< max-1)
        {
            name[++point]=v;
        }
        else
        {
            System.out.println("SHELF FULL");
        }
    }

    void display()
    {
        for(int i=point;i>=0;i--)
        {
            System.out.println(name[i]);
        }
    }
}
