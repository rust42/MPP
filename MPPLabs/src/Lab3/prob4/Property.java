package Lab3.prob4;

public abstract class Property implements Rentable  {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    abstract  public double computeRent();


    @Override
    public String toString() {
        return  "<Property:  address: " + address + ">";
    }
}
