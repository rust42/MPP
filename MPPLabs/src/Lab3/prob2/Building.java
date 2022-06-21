package Lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

    final private double tax;
    final private double maintenanceCost;
    final private List<Apartment> apartments;

    public double getTax() {
        return tax;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public Building(double maintenanceCost, double tax) {
        apartments = new ArrayList<>();
        this.maintenanceCost = maintenanceCost;
        this.tax = tax;
    }

    public void addApartment(Apartment apartment) {
        this.apartments.add(apartment);
    }
}
