package Lab3.prob4;

public class House extends Property {

    private double lotSize;

    House(double lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return lotSize * 0.1;
    }
}
