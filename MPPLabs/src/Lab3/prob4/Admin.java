package Lab3.prob4;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static double computeTotalRent(Rentable[] rentables) {
		double totalRent = 0;
		for (Rentable property : rentables) {
			totalRent += property.computeRent();
		}
		return totalRent;
	}

	public static List<Property> getProperties(Property[] properties, String city) {

		List<Property> foundProperties = new ArrayList<>();
		for (Property property: properties) {
			Address propertyAddress = property.getAddress();
			if (propertyAddress.getCity().equals(city)) {
				foundProperties.add(property);
			}
		}
		return foundProperties;
	}
}
