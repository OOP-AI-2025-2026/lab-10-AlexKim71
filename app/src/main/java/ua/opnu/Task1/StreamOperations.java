package ua.opnu.Task1;

import java.util.List;
import java.util.stream.Collectors;

// Завдання 1: Подвоєння кожного числа у списку
public class StreamOperations {
    
    // Повертає новий список з подвоєними значеннями
    public static List<Integer> doubling(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
}