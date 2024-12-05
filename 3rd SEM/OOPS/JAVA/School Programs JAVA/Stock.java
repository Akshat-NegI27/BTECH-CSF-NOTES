public class Stock
{
    String ite;
    int qty, rat;
    double amt=0;
    
    Stock(String item, int quantity, int rate)
    {
        ite=item;
        qty=quantity;
        rat=rate;
    }
    
    void display()
    {
        System.out.println("Item=>"+ite);
        System.out.println("Quantity=>"+qty);
        System.out.println("Rate=>"+rat);
        System.out.println("Amount=>"+amt);
    }
}