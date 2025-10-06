package Lesson15;

//Пользователь вводит набор чисел в виде одной строки с клавиатуры.
//Например: "1, 2, 3, 4, 4, 5".
//Избавиться от повторяющихся элементов в строке.
//Вывести результат на экран.
//При решении использовать коллекции.

import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа:");
        String num = sc.nextLine();

        String[] numArr = num.split("\\W+");
        HashSet<String> numSet = new HashSet<>();
        for (String n : numArr) {
            numSet.add(n);
        }

        System.out.println("Без повторов: " + numSet);

        sc.close();
    }
}
