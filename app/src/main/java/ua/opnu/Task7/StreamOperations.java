package ua.opnu.Task7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Завдання 7: Видалення дублікатів та сортування за довжиною
public class StreamOperations {
    
    // Повертає список унікальних рядків, відсортованих за зменшенням довжини
    public static List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
    }
}