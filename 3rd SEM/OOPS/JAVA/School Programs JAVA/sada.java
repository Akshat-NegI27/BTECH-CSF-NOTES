import java.io.*;
public class  sada
System.out.print("Capacity of the bookshelf: ");  int size = Integer.parseInt(br.readLine());  Book obj = new Book(size);
System.out.println("1. Last Entered");  System.out.println("2. Add New");  
System.out.println("3. List All");  
System.out.print("Enter your choice: ");  
int choice = Integer.parseInt(br.readLine());  
switch(choice) 
{  
case 1:  
obj.tell();  
break;  
case 2:  System.out.print("Book title:");  
String title=br.readLine(); 
 obj.add(title); 
break; 
 case 3:  
obj.display(); 
 break;  
default:
S.o.pln("Wrong choice");
}
}
}