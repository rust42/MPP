package Practises;

public abstract class Property implements Rentable {
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
