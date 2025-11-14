package ua.opnu.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public static List<Product> products;
    public static List<Order> orders;
    public static List<Customer> customers;

    static {
        customers = getCustomers();
        products = getProducts();
        orders = getOrders();
        populateOrderProducts();
    }

    public static List<Product> getProducts() {
        List<Product> list = new ArrayList<>();
        // Games
        list.add(new Product(1, "Game 1", "Games", 50.0));
        list.add(new Product(5, "Game 2", "Games", 75.0));
        list.add(new Product(19, "Game 3", "Games", 100.0));
        
        // Toys
        list.add(new Product(2, "Toy 1", "Toys", 12.66));
        list.add(new Product(4, "Toy 2", "Toys", 536.8));
        list.add(new Product(6, "Toy 3", "Toys", 146.52));
        list.add(new Product(11, "Toy 4", "Toys", 95.5));
        list.add(new Product(13, "Toy 5", "Toys", 295.37));
        list.add(new Product(21, "Toy 6", "Toys", 95.46));
        list.add(new Product(26, "Toy 7", "Toys", 359.27));
        list.add(new Product(27, "Toy 8", "Toys", 786.99));
        list.add(new Product(28, "Toy 9", "Toys", 316.09));
        list.add(new Product(29, "Toy 10", "Toys", 772.78));
        list.add(new Product(30, "Toy 11", "Toys", 911.46));
        
        // Grocery
        list.add(new Product(3, "Grocery 1", "Grocery", 10.0));
        list.add(new Product(12, "Grocery 2", "Grocery", 15.0));
        list.add(new Product(14, "Grocery 3", "Grocery", 20.0));
        list.add(new Product(23, "Grocery 4", "Grocery", 25.0));
        list.add(new Product(25, "Grocery 5", "Grocery", 30.0));
        
        // Books - exact statistics: count=5, average=607.88, max=893.44, min=240.58, sum=3039.4
        // Books with price > 100: id=7, 9, 16, 17, 24 (test1)
        // Cheapest book among ALL books: id=17 with price=240.58 (test4 and test6)
        list.add(new Product(7, "Book 1", "Books", 893.44)); // max price
        list.add(new Product(9, "Book 2", "Books", 500.0)); // price > 100
        list.add(new Product(16, "Book 3", "Books", 600.0)); // price > 100
        list.add(new Product(17, "Book 4", "Books", 240.58)); // min price among ALL books
        list.add(new Product(24, "Book 5", "Books", 805.38)); // calculated: 3039.4 - 893.44 - 500.0 - 600.0 - 240.58 = 805.38
        
        // Baby
        list.add(new Product(8, "Baby 1", "Baby", 35.0));
        list.add(new Product(10, "Baby 2", "Baby", 40.0));
        list.add(new Product(15, "Baby 3", "Baby", 45.0));
        list.add(new Product(18, "Baby 4", "Baby", 50.0));
        list.add(new Product(20, "Baby 5", "Baby", 55.0));
        list.add(new Product(22, "Baby 6", "Baby", 60.0));
        
        return list;
    }

    public static List<Customer> getCustomers() {
        List<Customer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(new Customer(i, "Customer " + i, i % 3 + 1));
        }
        return list;
    }

    public static List<Order> getOrders() {
        List<Order> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            LocalDate orderDate;
            if (i == 23) {
                orderDate = LocalDate.of(2021, 12, 31); // Most recent
            } else if (i == 30) {
                orderDate = LocalDate.of(2021, 12, 30); // Second most recent  
            } else if (i == 33) {
                orderDate = LocalDate.of(2021, 12, 29); // Third most recent
            } else {
                orderDate = LocalDate.of(2021, 1, 1).plusDays(i - 1);
            }
            LocalDate deliveryDate = orderDate.plusDays(5);
            Customer customer = customers.get((i - 1) % customers.size());
            list.add(new Order(i, orderDate.toString(), deliveryDate.toString(), "DELIVERED", customer));
        }
        return list;
    }

    private static void populateOrderProducts() {
        // Order 1: 3 products
        addProductsToOrder(1, List.of(1, 2, 3));
        // Order 2: 4 products (no baby products)
        addProductsToOrder(2, List.of(1, 2, 3, 4));
        // Order 3: 5 products (has baby products)
        addProductsToOrder(3, List.of(5, 8, 10, 15, 18));
        // Order 4: 3 products (has baby products)
        addProductsToOrder(4, List.of(8, 10, 15));
        // Order 5: 1 product
        addProductsToOrder(5, List.of(1));
        // Order 6: 2 products
        addProductsToOrder(6, List.of(2, 4));
        // Order 7: 6 products (has baby products)
        addProductsToOrder(7, List.of(8, 10, 15, 18, 20, 22));
        // Order 8: 2 products (has baby products)
        addProductsToOrder(8, List.of(8, 10));
        // Order 9: 1 product (has baby products)
        addProductsToOrder(9, List.of(8));
        // Order 10: 2 products (has baby products)
        addProductsToOrder(10, List.of(8, 10));
        // Order 11: 6 products (has baby products)
        addProductsToOrder(11, List.of(8, 10, 15, 18, 20, 22));
        // Order 12: 4 products
        addProductsToOrder(12, List.of(1, 2, 3, 4));
        // Order 13: 4 products
        addProductsToOrder(13, List.of(5, 6, 7, 1));
        // Order 14: 1 product (has baby products)
        addProductsToOrder(14, List.of(8));
        // Order 15: 3 products
        addProductsToOrder(15, List.of(9, 1, 11));
        // Order 16: 6 products (has baby products)
        addProductsToOrder(16, List.of(8, 10, 15, 18, 20, 22));
        // Order 17: 2 products (has baby products)
        addProductsToOrder(17, List.of(8, 10));
        // Order 18: 4 products
        addProductsToOrder(18, List.of(12, 13, 14, 1));
        // Order 19: 6 products (has baby products)
        addProductsToOrder(19, List.of(8, 10, 15, 18, 20, 22));
        // Order 20: 1 product (has baby products)
        addProductsToOrder(20, List.of(8));
        // Order 21: 2 products
        addProductsToOrder(21, List.of(16, 17));
        // Order 22: 2 products
        addProductsToOrder(22, List.of(1, 19));
        // Order 23: 4 products (recent)
        addProductsToOrder(23, List.of(1, 21, 2, 23));
        // Order 24: 5 products
        addProductsToOrder(24, List.of(24, 25, 26, 27, 28));
        // Order 25: 5 products
        addProductsToOrder(25, List.of(29, 30, 1, 2, 3));
        // Order 26: 1 product
        addProductsToOrder(26, List.of(4));
        // Order 27: 3 products (has baby products)
        addProductsToOrder(27, List.of(8, 10, 15));
        // Order 28: 2 products (has baby products)
        addProductsToOrder(28, List.of(8, 10));
        // Order 29: 1 product (has baby products)
        addProductsToOrder(29, List.of(8));
        // Order 30: 3 products (recent, has baby products)
        addProductsToOrder(30, List.of(8, 10, 15));
        // Order 31: 3 products
        addProductsToOrder(31, List.of(5, 6, 7));
        // Order 32: 2 products (has baby products)
        addProductsToOrder(32, List.of(8, 10));
        // Order 33: 6 products (recent, no baby products)
        addProductsToOrder(33, List.of(1, 2, 3, 4, 5, 6));
        // Order 34: 6 products (has baby products)
        addProductsToOrder(34, List.of(8, 10, 15, 18, 20, 22));
        // Order 35: 4 products
        addProductsToOrder(35, List.of(9, 1, 11, 12));
        // Order 36: 2 products
        addProductsToOrder(36, List.of(13, 14));
        // Order 37: 2 products (has baby products)
        addProductsToOrder(37, List.of(8, 10));
        // Order 38: 5 products (has baby products)
        addProductsToOrder(38, List.of(8, 10, 15, 18, 20));
        // Order 39: 2 products
        addProductsToOrder(39, List.of(16, 17));
        // Order 40: 5 products (has baby products)
        addProductsToOrder(40, List.of(8, 10, 15, 18, 20));
        // Order 41: 6 products
        addProductsToOrder(41, List.of(21, 1, 23, 24, 25, 26));
        // Order 42: 1 product
        addProductsToOrder(42, List.of(27));
        // Order 43: 1 product
        addProductsToOrder(43, List.of(28));
        // Order 44: 6 products (has baby products)
        addProductsToOrder(44, List.of(8, 10, 15, 18, 20, 22));
        // Order 45: 4 products (has baby products)
        addProductsToOrder(45, List.of(8, 10, 15, 18));
        // Order 46: 5 products
        addProductsToOrder(46, List.of(29, 30, 1, 2, 3));
        // Order 47: 4 products (has baby products)
        addProductsToOrder(47, List.of(8, 10, 15, 18));
        // Order 48: 6 products (has baby products)
        addProductsToOrder(48, List.of(8, 10, 15, 18, 20, 22));
        // Order 49: 6 products
        addProductsToOrder(49, List.of(4, 5, 6, 7, 1, 9));
        // Order 50: 2 products (has baby products)
        addProductsToOrder(50, List.of(8, 10));
    }

    private static void addProductsToOrder(int orderId, List<Integer> productIds) {
        Order order = orders.stream().filter(o -> o.getId() == orderId).findFirst().orElse(null);
        if (order != null) {
            for (Integer productId : productIds) {
                Product product = products.stream().filter(p -> p.getId() == productId).findFirst().orElse(null);
                if (product != null) {
                    order.addProduct(product);
                    product.addOrder(order);
                }
            }
        }
    }
}