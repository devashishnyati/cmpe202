package five_guys_burger;

public class Meat extends Leaf
{
  
    public Meat(String description)
    {
        super(description);
    }
    
    public void display(){
        System.out.println(" -> | "+description);
    } 
}
