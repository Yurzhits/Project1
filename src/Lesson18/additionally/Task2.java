package Lesson18.additionally;

//Сумма чисел, кратных 3 или 5
//Дан список List<Integer> numbers.
//Найти сумму всех чисел, кратных 3 или 5.

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(x -> x % 3 == 0 || x % 5 == 0)
                .reduce(0, (x, y) -> x + y);

        System.out.println("Сумма: " + sum);
    }
}
