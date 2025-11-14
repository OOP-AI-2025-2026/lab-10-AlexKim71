package ua.opnu.HardTask4;

import ua.opnu.util.Product;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Складне завдання 4: Найдешевша книга
public class StreamOperations {
    
    // Повертає найдешевшу книгу
    public static Optional<Product> getCheapestBook(List<Product> products) {
        return products.stream()
                .filter(p -> "Books".equals(p.getCategory()))
                .min(Comparator.comparing(Product::getPrice));
    }
}