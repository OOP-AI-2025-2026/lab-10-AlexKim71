package ua.opnu.HardTask5;

import ua.opnu.util.Order;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Складне завдання 5: Три останні замовлення
public class StreamOperations {
    
    // Повертає три останні замовлення (найближчі до поточної дати)
    public static List<Order> getRecentOrders(List<Order> orders) {
        return orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}