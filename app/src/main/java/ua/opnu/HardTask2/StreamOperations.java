package ua.opnu.HardTask2;

import ua.opnu.util.Order;
import ua.opnu.util.Product;
import java.util.List;
import java.util.stream.Collectors;

// Складне завдання 2: Замовлення з товарами категорії Baby
public class StreamOperations {
    
    // Повертає список замовлень, що містять товари категорії Baby
    public static List<Order> getOrdersWithBabyProducts(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> "Baby".equals(product.getCategory())))
                .collect(Collectors.toList());
    }
}