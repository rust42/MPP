package Lab3.prob4;

public class Condo extends Property {
    private final double numberOfFloors;

    Condo(double numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double computeRent() {
        return numberOfFloors * 400.0;
    }
}
