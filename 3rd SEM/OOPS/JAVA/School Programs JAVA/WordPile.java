import java.util.Scanner;
public class WordPile
{    
Scanner sc=new Scanner(System.in);
char ch[]=new char[20];
int capacity,topmost;
WordPile(int cap)
{    
capacity=cap;
topmost=-1;
ch=new char[capacity];
} 
void pushChar(char v)
{
if(topmost< capacity-1)
{
topmost=topmost+1;
ch[topmost]=v;
}
else
{   
System.out.println("WordPile is full");
}
}
char popChar()
{
if(topmost>=0)
{
return ch[topmost];
}
else
{
return'\\';
}
}
}
