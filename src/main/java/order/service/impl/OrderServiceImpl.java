package order.service.impl;
import order.entities.Customer;
import order.entities.Order;
import order.service.OrderService;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    private List<Order> orders = new ArrayList<>();

    @Override
    public Order create(int id, int productId, int amount, Customer customer) {
        Order order = new Order(id, productId, amount, customer);
        orders.add(order);

        return order;
    }
}


