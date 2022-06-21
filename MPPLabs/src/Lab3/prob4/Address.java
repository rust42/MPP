package Lab3.prob4;

public class Address {
    final private String street;
    final private String city;
    final private String postalCode;

    Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Street: " + street + ", City: " + city + ", postalCode: " + postalCode;
    }
}
