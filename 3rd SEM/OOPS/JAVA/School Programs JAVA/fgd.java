import java.io.*;
class PrimeAdam
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void show() throws Exception
 {
      int m,n,i,f=0;
      System.out.print("\nEnter value of 'm': ");
      m=Integer.parseInt(br.readLine());
      System.out.print("\nEnter value of 'n': ");
      n=Integer.parseInt(br.readLine());
      if(m>=n)
      {
          System.out.print("\nINVALID INPUT");
          return;
        }
        System.out.print("\nTHE PRIME-ADAM INTEGERS ARE\n");
      for(i=m;i<=n;i++)
      {         
          if(prime(i) && adam(i))
          {
          System.out.print(" "+i);
          f++;
        }
      }
      if(f==0)
      System.out.print("\nNIL");
      else
      System.out.print("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: "+f);
    }
   private boolean prime(int n)
    {
        int i;
           for(i=2;i<=n-1;i++)
           {
               if(n%i==0)
               break;
            }
            if(i==n)
            return true;
            else
            return false;
    }
     private boolean adam(int n)
   {
       int x,y;
       x=n*n;
       y=rev(n);
       y=y*y;
       y=rev(y);
       if(x==y)
       return true;
       else
       return false;
    }

  private  int rev(int n)
    {
        int i,r=0;
        for(i=n;i> 0;i=i/10)
        {
             r=r*10+i%10;
         }
         return r;
     }
     public static void main(String args[]) throws Exception
     {
         PrimeAdam ob=new PrimeAdam();
         ob.show();
      }
    }
