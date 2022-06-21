package Lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private List<Building> buildingList;

    public LandlordInfo() {
        this.buildingList = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        this.buildingList.add(building);
    }

    public int calcProfits() {
        double totalProfit = 0;
        for (Building building: buildingList) {
            double totalRent = building.getApartments()
                    .stream()
                    .reduce(0.0, (sum, apartment) -> sum + apartment.getRent(), Double::sum);
            totalProfit += totalRent - building.getMaintenanceCost() - building.getTax();
        }
        return (int)totalProfit;
    }
}
