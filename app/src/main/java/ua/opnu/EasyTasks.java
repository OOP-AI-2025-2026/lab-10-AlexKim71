package ua.opnu;

import java.util.List;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(java.util.stream.Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .collect(java.util.stream.Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(java.util.stream.Collectors.toList());
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(java.util.stream.Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(java.util.stream.Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(java.util.stream.Collectors.toList());
    }

    public List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted(java.util.Comparator.comparing(String::length).reversed())
                .collect(java.util.stream.Collectors.toList());
    }

    public List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(s -> java.util.Arrays.stream(s.split(" ")))
                .collect(java.util.stream.Collectors.toList());
    }

}