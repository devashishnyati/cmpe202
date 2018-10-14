package five_guys_burger;

import java.text.DecimalFormat;

public class CustomBurger extends Composite
{

    private double amt;
    public CustomBurger ( String d )
    {
        super(d) ;
        setPrice();
    }
    
    public double setPrice()
    {
        switch(description){
            case"LBB":
                this.amt = 5.59;
                break;
            default:
                this.amt = 0.00;
        }
        return this.amt;
    }
    
    public void display() 
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        String printDesc = "\n " + description + " " + fmt.format(setPrice()) + "\n";
        System.out.println(description + " ");
        for (Component obj  : components)
        {
            obj.display();
        }
    }
} 