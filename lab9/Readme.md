####Traditional Decorator
In the conventional approach we create decorator classes for toppings and cheese which are decorated later.

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

####Lambda Decorator
Instead of creating decorator classes, we directly pass them by lambda functions. So we don't need to write decorator classes.

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
