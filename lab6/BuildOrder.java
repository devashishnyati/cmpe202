package five_guys_burger;

public class BuildOrder
{
    public static void run()
    {
        Composite order = new Composite("-");
        
        CustomBurger burger = new CustomBurger("LBB");
        Toppings lettuce = new Toppings("LETTUCE");
        Toppings tomato = new Toppings("TOMATO");
        Meat garlicOnion = new Meat("G ONION");
        Meat jalaGrilled = new Meat("JALA Grilled");
        Bacon bacon = new Bacon("Bacon");
        Fries fries = new Fries("LTL CAJ", "LITTLE");
        
        burger.addChild(lettuce);
        burger.addChild(tomato);
        burger.addChild(garlicOnion);
        burger.addChild(jalaGrilled);
        burger.addChild(bacon);
        

        
        double friesAmt = fries.setPrice();
        double burgerAmt = burger.setPrice();
        
        double netAmt = friesAmt + burgerAmt;
        
        order.addChild(burger);
        order.addChild(fries);
        
        Receipt custReceipt = new Receipt(netAmt);
        custReceipt.display(order);
        
        PackagingSlip packingslip = new PackagingSlip();
        packingslip.display(order);

    }  
}
