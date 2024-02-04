package order.service;

import order.entities.Customer;
import order.entities.Order;

public interface OrderService {

    Order create(int id, int productId, int amount, Customer customer);

}
