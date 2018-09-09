import java.util.ArrayList;


public class GumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State invalidCoinState;
	State state = soldOutState;
	
	int count = 0;
	int cost = 0;
	int total_money = 0;
	ArrayList<Integer> accepted_coins;
 
	public GumballMachine(int numberGumballs, int machineNumber) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NotEnoughMoneyState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		invalidCoinState = new NotValidCoinState(this);
		if (machineNumber == 1) {
			this.cost = 25;
			this.accepted_coins.add(25);
		}
		else if (machineNumber == 2) {
			this.cost = 50;
			this.accepted_coins.add(25);
		}
		else if (machineNumber == 3) {
			this.cost = 50;
			this.accepted_coins.add(5);
			this.accepted_coins.add(10);
			this.accepted_coins.add(25);
		}
		
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}

	public void insertCoin(int value) {
		if (state == invalidCoinState) {
			System.out.println("Complete earlier transaction first, eject the invalid coin");
		}
		else {
			this.total_money = total_money + value;
			if (!this.accepted_coins.contains(value)) {
				state = invalidCoinState;
			}		
			state.insertCoin(value);
		}
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
			total_money = total_money - cost;
		}
	}
 
	int getCount() {
		return count;
	}
	
	int getMoneyCollected() {
		return total_money;
	}
 
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public State getNotValidCoinState() {
        return invalidCoinState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}