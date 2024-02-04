package order.service.impl;

import order.entities.Invoice;
import order.entities.Order;
import order.service.InvoiceService;

import java.util.ArrayList;
import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {
    private List<Invoice> invoices = new ArrayList<>();

    @Override
    public Invoice create(int id, Order order) {
        Invoice invoice = new Invoice(id, order);
        invoices.add(invoice);

        return  invoice;
    }
    @Override
    public Invoice getByAmount() {

        return null;
    }
}
