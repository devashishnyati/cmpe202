
public class Seperator extends CreditCardDecorator {
	 Seperator wrapped;
	 public String cvcdetails="";
	
	 public void wrapDecorator( Seperator w ) 
	   {
		
	       this.wrapped = w ;
	       
	   }
	 
	

	public String getDetails(String cvcno) {
		System.out.println("Inside get details");
		StringBuffer cvc= new StringBuffer();
		
		for (int i = 0; i < cvcno.length(); i++){
			if(i==2) {
				cvc.append("/"+cvcno.charAt(i));
			}
				else
					cvc.append(cvcno.charAt(i));
			
			
		}
		this.cvcdetails=cvc.toString();

        return this.cvcdetails;
    }
	 
	
}
