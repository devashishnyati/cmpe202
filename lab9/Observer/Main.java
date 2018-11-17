public class Main {
 
	public static void main(String args[]) {
		Beverage beverage2 = new Decafe();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Milk(beverage2);
		System.out.println(beverage2.getDescription());
 
		Beverage beverage3 = new Expresso();
		beverage3 = new Milk(beverage3);
		beverage3 = new Milk(beverage3);
		System.out.println(beverage3.getDescription());
	}
}