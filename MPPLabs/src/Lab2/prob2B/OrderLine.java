package Lab2.prob2B;

public class OrderLine {

    public Order getOrder() {
        return order;
    }

    private Order order;
    OrderLine(Order order) {
        this.order = order;
    }
}
