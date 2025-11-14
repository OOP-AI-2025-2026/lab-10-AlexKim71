package ua.opnu.Task2;

import java.util.List;
import java.util.stream.Collectors;

// Завдання 2: Піднесення кожного числа до квадрату
public class StreamOperations {
    
    // Повертає новий список з квадратами чисел
    public static List<Integer> square(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
}