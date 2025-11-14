package ua.opnu.Task3;

import java.util.List;
import java.util.stream.Collectors;

// Завдання 3: Додавання символу 'y' на початок та кінець кожного рядка
public class StreamOperations {
    
    // Повертає новий список з рядками, обрамленими символом 'y'
    public static List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }
}