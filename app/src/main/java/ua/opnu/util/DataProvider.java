package ua.opnu.util;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public static List<Product> products;
    public static List<Order> orders;
    public static List<Customer> customers;

    static {
        products = getProducts();
        customers = getCustomers();
        orders = getOrders();

        // Популяція зв'язків між замовленнями та товарами
        populateOrderProduct(1, 1);
        populateOrderProduct(1, 2);
        populateOrderProduct(2, 3);
        populateOrderProduct(2, 4);
        populateOrderProduct(3, 5);
    }

    public static List<Product> getProducts() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Java Programming", "Books", 150.0));
        list.add(new Product(2, "Python Guide", "Books", 80.0));
        list.add(new Product(3, "Toy Car", "Toys", 25.0));
        list.add(new Product(4, "Baby Bottle", "Baby", 15.0));
        list.add(new Product(5, "Lego Set", "Toys", 60.0));
        return list;
    }

    public static List<Customer> getCustomers() {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1, "Іван Іванов", 1));
        list.add(new Customer(2, "Марія Петрова", 2));
        list.add(new Customer(3, "Олег Сидоров", 1));
        return list;
    }

    public static List<Order> getOrders() {
        List<Order> list = new ArrayList<>();
        list.add(new Order(1, "2021-04-01", "2021-04-05", "DELIVERED", getCustomerFromId(1)));
        list.add(new Order(2, "2021-04-02", "2021-04-06", "SHIPPED", getCustomerFromId(2)));
        list.add(new Order(3, "2021-04-03", "2021-04-07", "PROCESSING", getCustomerFromId(3)));
        return list;
    }

    private static Customer getCustomerFromId(int id) {
        return customers.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    private static void populateOrderProduct(int orderId, int productId) {
        Order order = orders.stream().filter(o -> o.getId() == orderId).findFirst().orElse(null);
        Product product = products.stream().filter(p -> p.getId() == productId).findFirst().orElse(null);
        
        if (order != null && product != null) {
            order.addProduct(product);
            product.addOrder(order);
        }
    }
}