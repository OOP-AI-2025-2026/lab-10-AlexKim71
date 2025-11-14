package ua.opnu.HardTask3;

import ua.opnu.util.Product;
import java.util.List;
import java.util.stream.Collectors;

// Складне завдання 3: Застосування знижки 50% до іграшок
public class StreamOperations {
    
    // Повертає список іграшок зі знижкою 50%
    public static List<Product> applyDiscountToToys(List<Product> products) {
        return products.stream()
                .filter(p -> "Toys".equals(p.getCategory()))
                .peek(p -> p.setPrice(p.getPrice() * 0.5))
                .collect(Collectors.toList());
    }
}