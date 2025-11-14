package ua.opnu;

import java.util.*;

// Головний клас для демонстрації всіх завдань лабораторної роботи 10
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота 10: Потоки даних в Java ===\n");
        
        // Прості завдання
        System.out.println("=== ПРОСТІ ЗАВДАННЯ ===\n");
        
        // Завдання 1: doubling
        System.out.println("--- Завдання 1: doubling ---");
        testTask1();
        
        // Завдання 2: square
        System.out.println("\n--- Завдання 2: square ---");
        testTask2();
        
        // Завдання 3: moreY
        System.out.println("\n--- Завдання 3: moreY ---");
        testTask3();
        
        // Завдання 4: noNeg
        System.out.println("\n--- Завдання 4: noNeg ---");
        testTask4();
        
        // Завдання 5: no9
        System.out.println("\n--- Завдання 5: no9 ---");
        testTask5();
        
        // Завдання 6: noZ
        System.out.println("\n--- Завдання 6: noZ ---");
        testTask6();
        
        // Завдання 7: refinedStrings
        System.out.println("\n--- Завдання 7: refinedStrings ---");
        testTask7();
        
        // Завдання 8: flatten
        System.out.println("\n--- Завдання 8: flatten ---");
        testTask8();
    }
    
    // Тести простих завдань
    private static void testTask1() {
        EasyTasks tasks = new EasyTasks();
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        System.out.println("Вхід: " + numbers);
        System.out.println("Результат: " + tasks.doubling(numbers));
    }
    
    private static void testTask2() {
        EasyTasks tasks = new EasyTasks();
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        System.out.println("Вхід: " + numbers);
        System.out.println("Результат: " + tasks.square(numbers));
    }
    
    private static void testTask3() {
        EasyTasks tasks = new EasyTasks();
        List<String> strings = Arrays.asList("a", "b", "c");
        System.out.println("Вхід: " + strings);
        System.out.println("Результат: " + tasks.moreY(strings));
    }
    
    private static void testTask4() {
        EasyTasks tasks = new EasyTasks();
        List<Integer> numbers = Arrays.asList(1, -2, 3, -4);
        System.out.println("Вхід: " + numbers);
        System.out.println("Результат: " + tasks.noNeg(numbers));
    }
    
    private static void testTask5() {
        EasyTasks tasks = new EasyTasks();
        List<Integer> numbers = Arrays.asList(1, 2, 19, 29, 3);
        System.out.println("Вхід: " + numbers);
        System.out.println("Результат: " + tasks.no9(numbers));
    }
    
    private static void testTask6() {
        EasyTasks tasks = new EasyTasks();
        List<String> strings = Arrays.asList("aaa", "bbb", "aza", "hello");
        System.out.println("Вхід: " + strings);
        System.out.println("Результат: " + tasks.noZ(strings));
    }
    
    private static void testTask7() {
        EasyTasks tasks = new EasyTasks();
        List<String> strings = Arrays.asList("aa", "c", "aa", "bbb");
        System.out.println("Вхід: " + strings);
        System.out.println("Результат: " + tasks.refinedStrings(strings));
    }
    
    private static void testTask8() {
        EasyTasks tasks = new EasyTasks();
        List<String> strings = Arrays.asList("John Wick", "Peter Parker", "NeroWolfe");
        System.out.println("Вхід: " + strings);
        System.out.println("Результат: " + tasks.flatten(strings));
    }
    

    

}