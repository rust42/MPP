package Practises;

public class Trailer extends Property{

    @Override public double computeRent() {
        return 0;
    }

    public String toString() {
        return "Trailer <address: " + getAddress().toString() + ">";
    }

}
