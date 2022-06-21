package Lab5.problem3.extpackage;

import java.time.LocalDate;

import Lab5.problem3.CustOrderFactory;
import Lab5.problem3.Customer;
import Lab5.problem3.Order;

public class Main {
	public static void main(String[] args) {

		Customer customer = CustOrderFactory.newCustomer("Bob");
		Order order = CustOrderFactory.newOrder(customer, LocalDate.now());
		CustOrderFactory.addItem(order, "Shirt");
		CustOrderFactory.addItem(order, "Laptop");

		order = CustOrderFactory.newOrder(customer, LocalDate.now());
		CustOrderFactory.addItem(order, "Pants");
		CustOrderFactory.addItem(order, "Knife set");
		System.out.println(customer.getOrders());
	}
}

		
