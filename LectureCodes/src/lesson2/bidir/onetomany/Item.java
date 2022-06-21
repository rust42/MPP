package lesson2.bidir.onetomany;

public class Item {
	private String name;
	private ShoppingCart cart;
	//package level access
	Item(String name, ShoppingCart cart) {
		this.name = name;
		this.cart = cart;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
