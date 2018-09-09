public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5, 5);

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(15);
		gumballMachine.ejectQuarter();
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(50);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}