package ua.opnu.util;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Order {
    private Integer id;
    private String orderDate;
    private String deliveryDate;
    private String status;
    private Customer customer;
    private Set<Product> products = new HashSet<>();

    public Order(Integer id, String orderDate, String deliveryDate, String status, Customer customer) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customer = customer;
    }

    public Integer getId() { return id; }
    public LocalDate getOrderDate() { return LocalDate.parse(orderDate); }
    public LocalDate getDeliveryDate() { return LocalDate.parse(deliveryDate); }
    public String getStatus() { return status; }
    public Customer getCustomer() { return customer; }
    public Set<Product> getProducts() { return products; }
    
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", orderDate=" + orderDate + ", status='" + status + "'}";
    }
}