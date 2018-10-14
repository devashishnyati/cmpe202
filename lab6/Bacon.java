package five_guys_burger;

public class Bacon extends Leaf
{
    public Bacon(String description)
    {
        super(description);
    }
    
    public void display(){
        System.out.println(" {{{{ " + description + " }}}} ");
    }
}