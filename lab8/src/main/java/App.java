/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;
    private CreditCardDecorator creditcarddecorator= new CreditCardDecorator();
    private Seperator seperator=new Seperator();

    public App() {	

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();
        
        num.wrapDecorator(creditcarddecorator);
        exp.wrapDecorator(seperator);
        
        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
    	if(ch.equalsIgnoreCase("x")&&count>0)
    		count--;
    	else
    		if(count<=23)
        count++;
        screen.key(ch, count);
        System.out.println("count is "+count);
        
    }

}