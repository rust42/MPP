package Practises;

public class Condo extends Property {
    @Override public double computeRent() {
        return 0;
    }

    public String toString() {
        return "Condo <address: " + getAddress().toString() + ">";
    }
}
