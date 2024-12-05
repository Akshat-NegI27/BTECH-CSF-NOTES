import java.util.*;  
public class Strontio_Number  
{  
    public static void main(String args[])   
    {  
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");  
            int num=sc.nextInt();  
            int n=num;  
            num=(num*2%1000)/10;  
            if(num%10==num/10)
            {
                System.out.println(n+ " is a Strontio Number.");  
            }   
            else  
                System.out.println(n+ " is not a Strontio Number.");
        }  
    }  
}  