package ua.opnu.HardTask8;

import ua.opnu.util.Product;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Складне завдання 8: Групування товарів за категоріями
public class StreamOperations {
    
    // Повертає Map з категорією як ключ та списком товарів як значення
    public static Map<String, List<Product>> getProductsByCategory(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }
}