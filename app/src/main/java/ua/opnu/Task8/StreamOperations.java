package ua.opnu.Task8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Завдання 8: Розбиття рядків на окремі слова
public class StreamOperations {
    
    // Повертає список окремих слів з рядків виду "Ім'я Прізвище"
    public static List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());
    }
}