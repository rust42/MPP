package Practises;

public class House extends Property {
    @Override public double computeRent() {
        return 0;
    }

    public String toString() {
        return "House <address: " + getAddress().toString() + ">";
    }

}
