package Lab3.prob4;
import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private String name;
    private List<Property> properties;

    Landlord(String name) {
        this.name = name;
        this.properties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        this.properties.add(property);
    }
}
