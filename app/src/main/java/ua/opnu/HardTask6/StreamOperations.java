package ua.opnu.HardTask6;

import ua.opnu.util.Product;
import java.util.DoubleSummaryStatistics;
import java.util.List;

// Складне завдання 6: Статистика цін книг
public class StreamOperations {
    
    // Повертає статистику цін для книг
    public static DoubleSummaryStatistics getBooksStats(List<Product> products) {
        return products.stream()
                .filter(p -> "Books".equals(p.getCategory()))
                .mapToDouble(Product::getPrice)
                .summaryStatistics();
    }
}