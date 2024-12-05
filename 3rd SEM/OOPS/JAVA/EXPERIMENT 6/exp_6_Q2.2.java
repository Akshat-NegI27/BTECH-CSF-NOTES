interface Walkable 
{ 
	void walk(); 
} 

interface Swimmable 
{ 
	void swim(); 
} 

class Duck implements Walkable, Swimmable 
{ 
	public void walk() 
	{ 
		System.out.println("Duck is walking."); 
	} 
	public void swim() 
	{ 
		System.out.println("Duck is swimming."); 
	} 
} 

class Main 
{ 
	public static void main(String[] args) 
	{ 
		Duck duck = new Duck(); 
		duck.walk(); 
		duck.swim();
		System.out.println ("Akshat Negi");
        System.out.println ("500106533");
        System.out.println ("R2142220414");

	} 
}
