package Strategy_Pattern;

public class Demo {

	   public static void main(String[] args) {
		   ShoppingCart cart = new ShoppingCart();

		   Item item1 = new Item("Code complete",120);
		   Item item2 = new Item("Design patterns in java",100);

		   cart.addItem(item1);
		   cart.addItem(item2);
	 
		   cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

	   
		   cart.pay(new CreditCardStrategy("Syed Bilawal Shah", "1234567890123456", "1234", "12/15"));
	   }

	   }
	

