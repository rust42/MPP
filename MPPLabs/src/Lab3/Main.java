package Lab3;

import Lab3.prob2.Apartment;
import Lab3.prob2.Building;
import Lab3.prob2.LandlordInfo;
import Lab3.prob3.Circle;
import Lab3.prob3.ComposedCircle;


public class Main {

	public static void main(String[] args) {
		Apartment[] apts0 = {
				new Apartment(600),
				new Apartment(700)};
		Apartment[] apts1 = {
				new Apartment(500),
				new Apartment(450)
		};
		Apartment[] apts2 = {
				new Apartment(1100),
				new Apartment(650)};

		Apartment[] apts3 = {
				new Apartment(6750),
				new Apartment(945)
		};
		Building[] bldgs = {
				new Building(150, 400),
				new Building(175, 900),
				new Building(150, 300),
				new Building(175, 775)
		};
		for(Apartment a : apts0) {
			bldgs[0].addApartment(a);
		}
		for(Apartment a : apts1) {
			bldgs[1].addApartment(a);
		}
		for(Apartment a : apts2) {
			bldgs[2].addApartment(a);
		}
		for(Apartment a : apts3) {
			bldgs[3].addApartment(a);
		}

		LandlordInfo landlord = new LandlordInfo();
		for(Building b: bldgs) {
			landlord.addBuilding(b);
		}
		System.out.println(landlord.calcProfits());



		Circle circle = new Circle(20);
		System.out.format("Radius of circle is: %.2f", circle.getRadius());
		System.out.println();
		System.out.format("Area of circle is: %.2f", circle.computeArea());
		System.out.println();


		ComposedCircle composedCircle = new ComposedCircle(20);
		System.out.format("Radius of circle is: %.2f", composedCircle.getRadius());
		System.out.println();
		System.out.format("Area of circle is: %.2f", composedCircle.computeArea());
		System.out.println();


	}
}


