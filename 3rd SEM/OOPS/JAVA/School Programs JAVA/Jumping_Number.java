import java.io.*;
class Jumping_Number
{
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a Positive Integer==> ");
            int num = Math.abs(Integer.parseInt(br.readLine()));
            int copy = num;
            boolean status = true;
            int diff = 0;
            while(num != 0)
            {
                    int d1 = num % 10;
                    num /= 10;
                    if(num != 0)
                    {
                        int d2 = num % 10;
                        if(Math.abs(d1 - d2) != 1)
                        {
                             status = false;
                             break;
                        }
                    }
            }
            if(status)
                System.out.println(copy + " is a Jumping Number.");
            else
                System.out.println(copy + " is not a Jumping Number.");
        }
}