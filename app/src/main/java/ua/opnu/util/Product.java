package ua.opnu.util;

import java.util.HashSet;
import java.util.Set;

public class Product {
    private Integer id;
    private String name;
    private String category;
    private Double price;
    private Set<Order> orders = new HashSet<>();

    public Product(Integer id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public Set<Order> getOrders() { return orders; }
    
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', category='" + category + "', price=" + price + "}";
    }
}