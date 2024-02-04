package order.service;

import order.entities.Invoice;
import order.entities.Order;

public interface InvoiceService {

    void create(int id, Order order);

    Invoice getByAmount();
}
