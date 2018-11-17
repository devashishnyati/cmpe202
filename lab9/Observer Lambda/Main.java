public class Main {
 
	public static void main(String args[]) {
		Pizza pizza1 = new ThinCrust();
		Pizza pizza1Toppings = () -> pizza1.getDescription() + ", Toppings";
		Pizza pizza1ToppingsCheese = () -> pizza1Toppings.getDescription() + ", Cheese";
		System.out.println(pizza1ToppingsCheese.getDescription());
 
		Pizza pizza2 = new ThickCrust();
		Pizza pizza2Cheese= () -> pizza2.getDescription() + ", Cheese";
		Pizza pizza2CheeseCheese = () -> pizza2Cheese.getDescription() + ", Cheese";
		System.out.println(pizza2CheeseCheese.getDescription());
	}
}