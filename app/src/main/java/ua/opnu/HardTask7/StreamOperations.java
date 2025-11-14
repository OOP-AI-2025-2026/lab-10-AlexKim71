package ua.opnu.HardTask7;

import ua.opnu.util.Order;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Складне завдання 7: Відображення ID замовлення -> кількість товарів
public class StreamOperations {
    
    // Повертає Map з ID замовлення як ключ та кількістю товарів як значення
    public static Map<Integer, Integer> getOrdersProductsMap(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.toMap(
                        Order::getId,
                        order -> order.getProducts().size()
                ));
    }
}