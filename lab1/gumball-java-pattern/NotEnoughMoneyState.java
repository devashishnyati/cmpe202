public class NotEnoughMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(int value) {
		System.out.println("You inserted a coin");
		System.out.println("Money collected is " + gumballMachine.total_money);
		if (gumballMachine.total_money >= gumballMachine.cost) {
			gumballMachine.setState(gumballMachine.getHasQuarterState());
		}
		else {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		
	}
 
	public void ejectQuarter() {
		if (gumballMachine.total_money > 0) {
			gumballMachine.total_money = 0;
			gumballMachine.setState(gumballMachine.getNoQuarterState());
			System.out.println("Money returned");
		}
		else {
			System.out.println("You need to insert money");
		}
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no enough money");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "insert money";
	}
}