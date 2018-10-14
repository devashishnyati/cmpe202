package five_guys_burger;

import java.text.DecimalFormat;

public class Receipt implements Strategy {
	
	double netAmt;
	public Receipt(double netAmt) {
		this.netAmt = netAmt;
	}
	
	
	public String display(Composite order){
		System.out.println("Receipt");
        StringBuffer Receipt = new StringBuffer();
        Receipt.append("\n----------------------------------------\n");
        Receipt.append("\n");
        order.display();
        Receipt.append("Sub. Total:");
        Receipt.append("\t\t$");
        DecimalFormat fmt = new DecimalFormat("$0.00");
        Receipt.append(fmt.format(this.netAmt) );
        Receipt.append("\n----------------------------------------\n");
        return Receipt.toString();
    }

}
