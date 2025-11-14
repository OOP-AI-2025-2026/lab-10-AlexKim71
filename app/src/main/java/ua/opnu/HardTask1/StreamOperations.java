package ua.opnu.HardTask1;

import ua.opnu.util.Product;
import java.util.List;
import java.util.stream.Collectors;

// Складне завдання 1: Книги з ціною більше 100
public class StreamOperations {
    
    // Повертає список книг з ціною більше 100
    public static List<Product> getBooksWithPrice(List<Product> products) {
        return products.stream()
                .filter(p -> "Books".equals(p.getCategory()))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());
    }
}