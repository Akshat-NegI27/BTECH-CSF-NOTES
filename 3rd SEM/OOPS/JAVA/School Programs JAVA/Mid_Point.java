import java.io.*;
class Mid_Point
{
    int x,y;
    Mid_Point()
    {
         x=0;
         y=0;
    }
    
    void readpoint()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Value for x");
        x= Integer.parseInt(br.readLine());
        System.out.println("Enter the Value for y");
        y= Integer.parseInt(br.readLine());
    }
    
    Mid_Point midpoint(Mid_Point A,Mid_Point B)
    {
        Mid_Point C= new Mid_Point();
        C.x=(A.x+B.x)/2;
        C.y=(A.y+B.y)/2;
        return C;
    }
    
    void Displaypoint()
    {
        System.out.println("The Mid point of Coordinates are : "+x);
        System.out.println("The Mid point of Coordinates are : "+y);
    }
    
    public static void main(String[]args)throws IOException
    {
        Mid_Point obj1 = new Mid_Point();
        obj1.readpoint();
        Mid_Point obj2 = new Mid_Point();
        obj2.readpoint();
        Mid_Point obj3= new Mid_Point();
        Mid_Point obj4= obj3.midpoint(obj1,obj2);
        obj4.Displaypoint();
    }
}