public class Main {
 
	public static void main(String args[]) {
		Pizza pizza1 = new ThinCrust();
		pizza1 = new Toppings(pizza1);
		pizza1 = new Cheese(pizza1);
		System.out.println(pizza1.getDescription());
 
		Pizza pizza2 = new ThickCrust();
		pizza2 = new Cheese(pizza2);
		pizza2 = new Cheese(pizza2);
		System.out.println(pizza2.getDescription());
	}
}