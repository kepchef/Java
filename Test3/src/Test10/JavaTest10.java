package Test10;

import Test10.Customer;

public class JavaTest10 {
	public static void main(String[] args) {
		Buyer  buyer  = new Customer();
		Seller seller = new Customer();
		
		buyer.buy();
		seller.sell();
	}
}