package Lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNum;

    final private List<OrderLine> orderLines;

    public Order(String orderNum) {
        this.orderNum = orderNum;
        this.orderLines =  new ArrayList<>();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }
}
