package order.service;

import order.entities.Customer;

import java.util.List;


public interface CustomerService  {
    void create(String customerName, int id);
    Customer getById(int id);
    List<Customer> getAll();
    String getCustomerWithC();
}

