package ua.opnu.Task4;

import java.util.List;
import java.util.stream.Collectors;

// Завдання 4: Фільтрація від'ємних чисел
public class StreamOperations {
    
    // Повертає новий список без від'ємних чисел
    public static List<Integer> noNeg(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }
}