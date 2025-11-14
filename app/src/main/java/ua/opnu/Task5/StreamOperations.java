package ua.opnu.Task5;

import java.util.List;
import java.util.stream.Collectors;

// Завдання 5: Фільтрація чисел, що закінчуються на 9
public class StreamOperations {
    
    // Повертає новий список без чисел, що закінчуються на 9
    public static List<Integer> no9(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }
}