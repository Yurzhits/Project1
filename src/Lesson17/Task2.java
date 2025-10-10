package Lesson17;

//Используя Predicate среди массива чисел вывести только те,
//которые являются положительными.

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 56, 0, -12, -4, 5, 6};
        Predicate<Integer> aboveZero = x -> x > 0;
        for (int i = 0; i < arr.length; i++) {
            if (aboveZero.test(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}
