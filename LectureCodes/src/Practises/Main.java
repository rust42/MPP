package Practises;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Property> properties = new ArrayList<>();
        Address address1 = new Address("Kathmandu", "Bagmati");
        Address address2 = new Address("Espoo", "UUsimaa");
        Address address3 = new Address("Fairfield", "Iowa");

        House house = new House();
        house.setAddress(address1);

        Condo condo = new Condo();
        condo.setAddress(address2);

        Trailer trailer = new Trailer();
        trailer.setAddress(address3);

        properties.add(house);
        properties.add(condo);
        properties.add(trailer);

        for (Rentable rentable: properties) {
            System.out.println("Property: " + rentable);
        }

    }
}
