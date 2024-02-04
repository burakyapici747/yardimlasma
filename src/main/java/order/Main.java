package order;


import order.entities.Order;
import order.service.*;
import order.service.impl.CostumerServiceImpl;
import order.service.impl.InvoiceServiceImpl;
import order.service.impl.OrderServiceImpl;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService = new CostumerServiceImpl();
        customerService.create("irem",1);
        customerService.create("ümit",2);
        customerService.create("can", 3);

        System.out.println("Sistemde kayıtlı müşteri sayısı : " +customerService.getAll().size());
        System.out.println(customerService.getCustomerWithC());

        InvoiceService invoiceService = new InvoiceServiceImpl();





    }
}
