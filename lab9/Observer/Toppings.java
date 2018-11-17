public class Toppings extends DecoratorExt {
	Pizza pizza;

	public Toppings(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Toppings";
	}

}