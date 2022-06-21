package Practises;

public class Address {
    private String city;
    private String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override public String toString() {
        return "<Address: " + city + ", " + state + ">";
    }
}
