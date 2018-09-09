public class NotValidCoinState implements State {
	GumballMachine gumballMachine;
	
	public NotValidCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


	public void insertCoin(int value) {
		System.out.println("Not a valid coin");
	}


	public void ejectQuarter() {
		gumballMachine.total_money = 0;
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		System.out.println("Money returned");
		
	}


	public void turnCrank() {
		System.out.println("Enter valid coins");		
	}


	public void dispense() {
		System.out.println("Enter valid coins");		
	}
	
	public String toString() {
		return "Invalid coin entered";
	}

}