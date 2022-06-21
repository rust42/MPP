package exampractise.prob2;

public class CD extends LendingItem {
    private String productid;
    private String title;
    private String company;

    CD(String productId, String title, String company) {
        this.productid = productId;
        this.title = title;
        this.company = company;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) {
            return false;
        }
        CD cd = (CD)obj;
        return cd.productid.equals(productid)
                && cd.title.equals(title)
                && cd.company.equals(company);
    }
}
