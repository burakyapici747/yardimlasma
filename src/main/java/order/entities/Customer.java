package order.entities;

import java.time.LocalDateTime;

public class Customer {
    private String customerName;
    private int id;
    private LocalDateTime dateOfRecord;

    public Customer(String customerName, int id, LocalDateTime dateOfRecord){
        this.customerName=customerName;
        this.id=id;
        this.dateOfRecord=dateOfRecord;

    }

    public String getCustomerName() {
        return customerName;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateOfRecord() {
        return dateOfRecord;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfRecord(LocalDateTime dateOfRecord) {
        this.dateOfRecord = dateOfRecord;
    }




}
