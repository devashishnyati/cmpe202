package five_guys_burger;

public class Toppings extends Leaf
{
  
    public Toppings(String description)
    {
        super(description);
    }
    
    public void display(){
        System.out.println(" "+description);
    } 
}