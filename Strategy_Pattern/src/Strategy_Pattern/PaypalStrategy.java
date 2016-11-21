package Strategy_Pattern;

public class PaypalStrategy implements PaymentStrategy {
	private String emailId;
	   private String password;

	   public PaypalStrategy(String email, String pwd){
			this.emailId=email;
			this.password=pwd;
		   }

	
	public void Pay(int amount) {
		System.out.println(amount + " Rupees paid using Paypal");	
	}

}
