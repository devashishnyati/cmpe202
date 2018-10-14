package five_guys_burger;

public class PackagingSlip implements Strategy {
	
	public PackagingSlip() {
		
	}
	
	public String display(Composite order){
		System.out.println("packaging slip");
        StringBuffer PackagingSlip = new StringBuffer();
        PackagingSlip.append("\n----------------------------------------\n");
        order.display();
        PackagingSlip.append("\n----------------------------------------\n");
        return PackagingSlip.toString();
    }

}
