package order.entities;

public class Invoice {
    private int id;
    private Order order;

    public Invoice(int id, Order order) {
        this.id = id;
        this.order = order;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Order getOrder(Invoice invoice) {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
}
