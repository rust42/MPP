package exampractise.prob2;

public class LibraryMember {
	private String memberId;
    private String firstName;
    private String lastName;
    private String phone;

    private CheckoutRecord checkoutRecord;

    LibraryMember(String id, String fname, String lname, String phone) {
        memberId = id;
        firstName = fname;
        lastName = lname;
        checkoutRecord = new CheckoutRecord();
        this.phone = phone;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CheckoutRecord getCheckoutRecord() {
        return checkoutRecord;
    }

    public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
        this.checkoutRecord = checkoutRecord;
    }
}
