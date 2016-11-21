package Strategy_Pattern;

public class CreditCardStrategy  implements PaymentStrategy{

	private String name;
	private String cardNumber;
	private String cardPIN;
	private String dateOfExpiry;

	public CreditCardStrategy(String name , String cardNumber ,  String cardPIN , String ExpiryDate)
	{
		this.name=name;
		this.cardNumber=cardNumber;
		this.cardPIN=cardPIN;
		this.dateOfExpiry=ExpiryDate;
	}

	public void Pay(int amount) {
		
		System.out.println(amount + " Rupees paid with Card");
	}

}
