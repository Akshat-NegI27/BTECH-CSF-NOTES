import java.io.*;
 class day1
{    
String vtr="", vtr1, vtr2,vtr3;
char Ch='t';
    void getString()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
        System.out.println("Enter the String");
        vtr1 = br.readLine();
    }       
     void change()
    {   
        for (int i= 0; i<vtr1.length();i++) 
        vtr2 = vtr1.substring(0);

        vtr3 = vtr2 + "" + vtr1;
        System.out.println ("This-"+vtr1);
    }
    void nextstr()
    {
        String str2 = " ";
        char ch3 = ' ';
        for (int i=0; i<vtr1.length(); i++)
        ch3= vtr1.(0);
        if (ch3=='.')
        {
        char ch4= (char)(ch3 + 1);
            str2 = str2 +ch4;
        }
    }
        
    public static void main(String[] args) throws IOException
    {
            day1 m = new day1();
            m.getString();
            m.change();
            m.nextstr();
    }
}



    

