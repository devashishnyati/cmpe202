public class Cheese extends DecoratorExt {
	Pizza pizza;

	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Cheese";
	}

}