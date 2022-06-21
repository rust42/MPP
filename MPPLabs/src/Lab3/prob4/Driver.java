package Lab3.prob4;

import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		Address add1 = new Address("Burlington Av. 1020", "Fairfield", "52556");
		Address add2 = new Address("1000 N St.", "Fairfield", "52557");
		Address add3 = new Address("Siltakylankuja", "Helsinki", "0750");

		House house = new House(9000);
		Condo condo = new Condo(2);
		Trailer trailer = new Trailer();

		Property[] objects = { house, condo, trailer };

		double totalRent = Admin.computeTotalRent(objects);

		String city = "Fairfield";
		house.setAddress(add1);
		condo.setAddress(add2);
		trailer.setAddress(add3);

		List<Property> properties = Admin.getProperties(objects, city);

		System.out.println(totalRent);
		System.out.println(properties + "Count: " + properties.size());
	}
}



