package lesson2.unidirectional.oneToZeroOneEasy_extpackage;

import lesson2.unidirectional.oneToZeroOneEasy.*;

public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		cust.addCart();
		cust.getCart().addItem(new Item("Shirt"));
		System.out.println(
			cust.getCart().getItems());
		
		
	}
	
}

		
