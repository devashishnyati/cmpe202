package five_guys_burger;

public class Fries extends Leaf 
{
    public double amt;
    public String size;
    
    public Fries(String d, String size)
    {
        super(d);
        this.size = size;
        this.setPrice();
    }
    
    public double setPrice(){
        switch(this.size){
            case"LITTLE":
                this.amt = 2.79;
                break;
            default:
                this.amt = 0.00;
        }
        return this.amt;
    }
    
    public void display(){
        System.out.println(description);
    } 
}