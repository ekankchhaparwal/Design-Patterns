package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<>();
    public void addOrder(Order order) {
        orders.add(order);
    }

    public void executeOrders() {
        for (Order  o: orders) {
            o.exceute();
        }
        orders.clear();
    }
}
