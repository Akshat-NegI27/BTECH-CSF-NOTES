import java.util.Scanner;
public class Array_to_Stack
{   
    int m[],st[];
    int cap,top;
    Scanner sc=new Scanner(System.in);
    Array_to_Stack(int n)
    {   
        cap=n;
        top=-1;
        st=new int[cap];
        m=new int[cap];
    }

    void input_marks()
    { 
        System.out.println("Enter "+cap+" elements in ascending order");
        for(int i=0;i< cap;i++)
        {
            m[i]=sc.nextInt();
            pushmarks(m[i]);

        }

    }
    
    void pushmarks(int v)
    {   
        if(top< cap-1)
        {
            top=top+1;
            st[top]=v;
        }
        else
        {
            System.out.println("stack is full");
        }
    }

    int popmarks()
    {   
        if(top>=0)
        {
            return st[top--];
        }
        else
        {
            return -999;
        }
    }
    
    void display()
    {    
        for(int i=top;i>=0;i--)
        {
            System.out.println(st[i]);
        }
    }
}