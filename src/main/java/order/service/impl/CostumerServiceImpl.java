package order.service.impl;

import order.entities.Customer;
import order.service.CustomerService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CostumerServiceImpl implements CustomerService {

    private List<Customer> customers = new ArrayList<>();
    @Override
    public Customer create(String customerName, int id) {
        Customer customer = new Customer(customerName, id,LocalDateTime.now());
        customers.add(customer);

        return customer;
    }
    @Override
    public Customer getById(int id) {
        for (int i=0; i<customers.size(); i++){
            if (customers.get(i).getId() == id){
             return customers.get(i);
            }
        }
        return null;
    }
    @Override
    public List<Customer> getAll() {
        return customers;
    }
    @Override
    public String getCustomerWithC() {
        String withC = "İsminde c harfi olan müşteriler : ";
        for (int i=0; i<customers.size(); i++){
            if (customers.get(i).getCustomerName().contains("c")){
                withC += customers.get(i).getCustomerName() +" ";
            }
        }
        return withC;
    }
}