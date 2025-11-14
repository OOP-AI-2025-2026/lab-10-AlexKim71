package ua.opnu.Task6;

import java.util.List;
import java.util.stream.Collectors;

// Завдання 6: Фільтрація рядків, що містять літеру 'z'
public class StreamOperations {
    
    // Повертає новий список без рядків, що містять літеру 'z'
    public static List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }
}